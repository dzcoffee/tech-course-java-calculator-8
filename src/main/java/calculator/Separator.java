package calculator;

public class Separator {
    int startIndex;
    int endIndex;
    String separator;

    public Separator(String input) {
        this.separator = findCustomSeparator(input);
    }

    public Boolean isSepartorNull(){
        if(this.separator == null) return true;
        return false;
    }

    public String getSeparator(){
        return this.separator;
    }

    public Integer getStartIndex(){
        return this.startIndex;
    }

    public Integer getEndIndex(){
        return this.endIndex;
    }

    public String findCustomSeparator(String input){
        int startIdx = input.indexOf("//");
        if(startIdx == -1) return null;

        int endIdx = input.indexOf("\\n");
        if(endIdx == -1) return null;

        this.startIndex = startIdx;
        this.endIndex = endIdx;

        return input.substring(startIdx + 2, endIdx);
    }
}
