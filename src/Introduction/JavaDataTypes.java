package Introduction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaDataTypes {

    private static boolean canBeFittedInByte(long number) {
        return number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE;
    }

    private static boolean canBeFittedInShort(long number) {
        return number >= Short.MIN_VALUE && number <= Short.MAX_VALUE;
    }

    private static boolean canBeFittedInInt(long number) {
        return number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE;
    }

    private static boolean canBeFittedInLong(long number) {
        return number >= Long.MIN_VALUE && number <= Long.MAX_VALUE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long number = scanner.nextLong();
                
                System.out.println(number + " can be fitted in:");
                if (canBeFittedInByte(number)) System.out.println("* byte");
                if (canBeFittedInShort(number)) System.out.println("* short");
                if (canBeFittedInInt(number)) System.out.println("* int");
                if (canBeFittedInLong(number)) System.out.println("* long");
                
            } catch (InputMismatchException e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }    
}
