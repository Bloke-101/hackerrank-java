package Strings;

public class MyRegex {
    
    private String pattern = 
        "((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}" + 
        "(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";

    public String getPattern() {
        return this.pattern;
    }
}
