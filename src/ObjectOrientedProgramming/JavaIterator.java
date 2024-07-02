package ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {

    static Iterator func(ArrayList mylist) {

        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String) break;
        }
        return it;

    }

    @SuppressWarnings({ "unchecked" })
    public static void main(String[] args) {
        
        ArrayList mylist = new ArrayList();
        
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int m = in.nextInt();
            
            for (int i = 0; i < n; i++) mylist.add(in.nextInt());
            mylist.add("###");
            for (int i = 0; i < m; i++) mylist.add(in.next());
        }

        Iterator it = func(mylist);
        
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}
