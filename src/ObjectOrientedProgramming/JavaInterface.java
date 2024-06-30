package ObjectOrientedProgramming;

import java.util.Scanner;

public class JavaInterface {

    private static void ImplementedInterfaceNames(Object o){
        for (Class<?> intf : o.getClass().getInterfaces()) {
            System.out.println(intf.getName());
        }
    }

    public static void main(String[] args){
        MyCalculator myCalculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(myCalculator);
        
        try (Scanner in = new Scanner(System.in)) {
            int n = Integer.parseInt(in.nextLine());    
            System.out.println(myCalculator.divisorSum(n));
        }        
    }
}
