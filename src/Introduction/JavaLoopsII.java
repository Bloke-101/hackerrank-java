package Introduction;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        int a;
        int b;
        int n;
        int m;

        for (int i = 0; i < t; i++) {
            m = 1;
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = scanner.nextInt();

            for (int j = 0; j < n; j++) {
                a += m * b;
                m *= 2;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
