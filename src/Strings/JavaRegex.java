package Strings;

import java.util.Scanner;

public class JavaRegex {

    private static MyRegex myRegex = new MyRegex();

    private static boolean isValidIP(String line) {
        return line.matches(myRegex.getPattern());
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(isValidIP(line));
            }
        }
    }
}
