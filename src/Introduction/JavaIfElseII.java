package Introduction;

import java.util.Scanner;

public class JavaIfElseII {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int i = scanner.nextInt();
        scanner.nextLine();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        scanner.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
