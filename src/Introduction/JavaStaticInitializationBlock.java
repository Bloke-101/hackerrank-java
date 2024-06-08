package Introduction;

import java.util.Scanner;

public class JavaStaticInitializationBlock {

    static int breadth;
    static int height;

    static {
        Scanner scanner = new Scanner(System.in);

        breadth = scanner.nextInt();
        scanner.nextLine();
        height = scanner.nextInt();

        scanner.close();
    }
    
    public static void main(String[] args) {
        if (breadth <= 0 || height <= 0) {
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println(breadth * height);
        }        
    }
}
