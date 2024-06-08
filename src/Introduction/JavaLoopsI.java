package Introduction;

import java.util.Scanner;

public class JavaLoopsI {

    public static void printMultiplicationTableColumn(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", number, i, number * i);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();

        printMultiplicationTableColumn(number);
    }
}
