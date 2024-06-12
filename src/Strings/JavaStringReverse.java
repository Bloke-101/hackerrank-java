package Strings;

import java.util.Scanner;

public class JavaStringReverse {

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        scanner.close();

        if (isPalindrome(str)) System.out.println("Yes");
        else System.out.println("No");
    }    
}
