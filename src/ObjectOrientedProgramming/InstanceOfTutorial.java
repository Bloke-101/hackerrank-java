package ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.Scanner;

public class InstanceOfTutorial {

    static String count(ArrayList<Person> mylist) {
        int a = 0;
        int b = 0;
        int c = 0;
        
        for(int i = 0; i < mylist.size(); i++){
            if (mylist.get(i) instanceof Student) {
                a++;
            } else if (mylist.get(i) instanceof Rockstar) {
                b++;
            } else if (mylist.get(i) instanceof Hacker) {
                c++;
            }
        }
        return Integer.toString(a) + " "
            + Integer.toString(b) + " "
            + Integer.toString(c);
   }

    public static void main(String[] args) {
        ArrayList<Person> mylist = new ArrayList<>();

        try (Scanner in = new Scanner(System.in)) {
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                String s = in.next();
                if (s.equals("Student")) {
                    mylist.add(new Student());
                } else if (s.equals("Rockstar")) {
                    mylist.add(new Rockstar());
                } else if (s.equals("Hacker")) {
                    mylist.add(new Hacker());
                } 
            }
            System.out.println(count(mylist));
        }
    }
}
