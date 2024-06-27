package Strings;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            BigInteger first = new BigInteger(in.nextLine());
            BigInteger second = new BigInteger(in.nextLine());

            System.out.println(first.add(second));
            System.out.println(first.multiply(second));   
        } 
    }
}
