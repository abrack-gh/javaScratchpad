package codeGym.Level17;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
Day of the week when you were born
*/

public class l17c03 {

    static Calendar birthDate = new GregorianCalendar(2020, Calendar.MARCH, 11);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {

        String result = "";

        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch(day){
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
        }

        return result;
    }
}

