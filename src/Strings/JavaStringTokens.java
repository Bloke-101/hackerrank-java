package Strings;

import java.util.Scanner;

public class JavaStringTokens {

    private static String[] splitByTokens(String str) {

        if (str.isBlank()) return new String[]{};
        return str.trim().split("[ !,?._'@]+");
    }
    
    public static void main(String[] args) {
        
        String str;
        
        try (Scanner scanner = new Scanner(System.in)) {
            str = scanner.nextLine();
        }
        
        String[] strSplitByTokens = splitByTokens(str);
        
        System.out.println(strSplitByTokens.length);
        for (String substr : strSplitByTokens) {
            System.out.println(substr);
        }
    }
}
