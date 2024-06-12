package Strings;

import java.util.Scanner;

public class JavaSubstringComparisons {
    
    public static String getSmallestAndLargest(String str, int substrLen) {
        
        if (str.length() <= substrLen) return str + "\n" + str;
        
        String smallest = str.substring(0, substrLen);
        String largest = str.substring(0, substrLen);
        
        for (int i = 0; i < str.length() - substrLen + 1; i++) {
            if (largest.compareTo(str.substring(i, i + substrLen)) < 0) {
                largest = str.substring(i, i + substrLen);
            }
            if (smallest.compareTo(str.substring(i, i + substrLen)) > 0) {
                smallest = str.substring(i, i + substrLen);
            } 
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int substrLen = scanner.nextInt();
        scanner.close();
      
        System.out.println(getSmallestAndLargest(str, substrLen));
    }
}
