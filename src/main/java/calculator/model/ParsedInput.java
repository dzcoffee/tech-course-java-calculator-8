package calculator.model;

public class ParsedInput {
    private String separatorRegex;
    private String numbersPart;

    public ParsedInput(String separatorRegex, String numbersPart) {
        this.separatorRegex = separatorRegex;
        this.numbersPart = numbersPart;
    }

    public String[] getNumberStrings() {
        return this.numbersPart.split(this.separatorRegex);
    }
}
