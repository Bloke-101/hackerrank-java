package Introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String border = "================================";

        System.out.println(border);
        for (int i = 0; i < 3; i++) {
            String text = scanner.next();
            int number = scanner.nextInt();
            
            System.out.printf("%-15s%03d\n", text, number);
        }
        scanner.close();
        System.out.println(border);
    }
}
