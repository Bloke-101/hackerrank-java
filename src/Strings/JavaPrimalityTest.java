package Strings;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

    private static boolean isPrime(BigInteger number) {
        return number.isProbablePrime(1);
    }
    
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            BigInteger number = new BigInteger(in.nextLine());
            
            if (isPrime(number)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        } 
    }
}
