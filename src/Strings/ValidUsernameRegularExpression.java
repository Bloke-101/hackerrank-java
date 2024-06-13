package Strings;

import java.util.Scanner;

public class ValidUsernameRegularExpression {

    private static boolean isValidUsername(String username) {
        return username.matches(UsernameValidator.PATTERN);
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int times = scanner.nextInt();
            scanner.nextLine();
            String username;
            for (int i = 0; i < times; i++) {
                username = scanner.nextLine();
                if (isValidUsername(username)) System.out.println("Valid");
                else System.out.println("Invalid");
            }
        } 
    }
}
