package calculator.model;

import java.util.regex.Pattern;

public class Separator {
    private final int endIndex;
    private final int startIndex;
    private final String separator;

    private static final String SEPARATOR_PREFIX = "//";
    private static final String SEPARATOR_SUFFIX = "\\n";

    public Separator(String input) {
        int startIdx = input.indexOf(SEPARATOR_PREFIX);
        int endIdx = input.indexOf(SEPARATOR_SUFFIX);

        if (startIdx != 0 || endIdx == -1) {
            throw new IllegalArgumentException("커스텀 구분자 형식이 올바르지 않습니다.");
        }
        this.startIndex = startIdx;
        this.endIndex = endIdx;

        this.separator = input.substring(startIdx + 2, endIdx);
    }

    public Boolean isSepartorNull() {
        if (this.separator == null) {
            return true;
        }
        return false;
    }

    public String getSeparatorAsRegex() {
        return Pattern.quote(this.separator);
    }

    public String getNumbersPart(String fullText) {
        return fullText.substring(this.endIndex + 2);
    }
}
