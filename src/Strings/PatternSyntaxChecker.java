package Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    
    public static void main(String[] args) {
        int times;

        try (Scanner scanner = new Scanner(System.in)) {
            times = scanner.nextInt();
            scanner.nextLine();
            
            for (int i = 0; i < times; i++) {
                try {
                    Pattern.compile(scanner.nextLine());
                    System.out.println("Valid");    
                } catch (PatternSyntaxException e) {
                    System.out.println("Invalid");
                }
            }
        }
    }
}
