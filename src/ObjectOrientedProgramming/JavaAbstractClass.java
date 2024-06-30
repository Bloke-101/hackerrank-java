package ObjectOrientedProgramming;

import java.util.Scanner;

public class JavaAbstractClass {
    
    public static void main(String[] args) {    
        try (Scanner in = new Scanner(System.in)) {
            String title = in.nextLine();
            MyBook newNovel = new MyBook();
            newNovel.setTitle(title);
            System.out.println("The title is: " + newNovel.getTitle());
        } 
    }
}
