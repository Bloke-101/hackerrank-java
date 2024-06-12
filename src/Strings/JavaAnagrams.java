package Strings;

import java.util.Scanner;

public class JavaAnagrams {

    private static int[] countEnglishLetters(String... strings) {
        
        int[] letterCounter = new int[26];

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                letterCounter[strings[i].toLowerCase().charAt(j) - 'a']++;
            }
        }
        return letterCounter;
    }

    private static boolean isAnagrams(String firstStr, String secondStr) {

        for (int letterCount : countEnglishLetters(firstStr, secondStr)) {
            if (letterCount % 2 == 1) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {

        String firstStr;
        String secondStr;

        try (Scanner scanner = new Scanner(System.in)) {
            firstStr = scanner.nextLine();
            secondStr = scanner.nextLine();
        }
        if (isAnagrams(firstStr, secondStr)) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
