package Introduction;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class JavaDateAndTime {

    private static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK,
            Calendar.LONG,
            Locale.getDefault()).toUpperCase();
    }
    
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        String dayOfWeek = findDay(month, day, year);
        
        System.out.println(dayOfWeek);
    }
}
