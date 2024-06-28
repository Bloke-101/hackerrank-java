package ExceptionHandling;

import java.util.Scanner;

class MyCalculator {

    public static long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }
}

public class ExceptionHandling2 {
    
    public static void main(String[] args) {
        
        try (Scanner in = new Scanner(System.in)) {
            int number;
            int power;
            
            while (in.hasNextInt()) {
                try {
                    number = in.nextInt();
                    power = in.nextInt();
    
                    System.out.println(MyCalculator.power(number, power));  

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}