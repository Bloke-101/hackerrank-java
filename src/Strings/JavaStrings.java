package Strings;

import java.util.Scanner;

public class JavaStrings {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.close();

        System.out.println(line.substring(start, end));
    }
}
