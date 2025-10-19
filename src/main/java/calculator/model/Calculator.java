package calculator.model;

public class Calculator {
    private static final String DEFAULT_SEPARATORS_REGEX = "[,:]";
    private static final String CUSTOM_SEPARATOR_PREFIX = "//";


    public int add(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        ParsedInput parsedInput = parseInput(text);
        String[] numberStrings = parsedInput.getNumberStrings();
        return sumNumbers(numberStrings);
    }

    private ParsedInput parseInput(String text) {
        if (text.startsWith(CUSTOM_SEPARATOR_PREFIX)) {
            Separator separator = new Separator(text);
            if (separator.isSepartorNull()) {
                throw new IllegalArgumentException("커스텀 구분자 형식이 올바르지 않습니다.");
            }

            String numbersPart = separator.getNumbersPart(text);
            String separatorRegex = separator.getSeparatorAsRegex();

            return new ParsedInput(separatorRegex, numbersPart);
        }

        return new ParsedInput(DEFAULT_SEPARATORS_REGEX, text);
    }

    private int sumNumbers(String[] numberStrings) {
        int sum = 0;
        for (String numberStr : numberStrings) {
            if (numberStr.isEmpty()) {
                continue;
            }

            int num = parseAndValidateNumber(numberStr);
            sum += num;
        }
        return sum;
    }

    private int parseAndValidateNumber(String numberStr) {
        int num;
        try {
            num = Integer.parseInt(numberStr);
        } catch (Exception e) {
            throw new IllegalArgumentException("유효하지 않은 숫자 형식입니다: '" + numberStr + "'", e);
        }

        if (num < 0) {
            throw new IllegalArgumentException("음수는 허용되지 않습니다: " + num);
        }

        return num;
    }

}
