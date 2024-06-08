package Introduction;

import java.util.Scanner;

public class JavaIfElseI {

    public static boolean isWeird(int number) {
        return number % 2 == 1 ^ (number >= 6 && number <= 20);
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();

        if (isWeird(number)) System.out.println("Weird");
        else System.out.println("Not Weird");
    }
}
