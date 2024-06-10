package Strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

    private static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() +
            word.substring(1, word.length());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        scanner.close();

        System.out.println(firstWord.length() + secondWord.length());
        System.out.println(firstWord.compareTo(secondWord) > 0 ? "YES" : "NO");
        System.out.printf("%s %s\n", capitalize(firstWord),
            capitalize(secondWord));
    }
}
