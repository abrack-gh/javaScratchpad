package codeGym.Level17;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
Another simple pattern
*/

public class l17c9c2 {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");

        String text = dtf.format(zonedDateTime);

        System.out.println(text);

    }
}
