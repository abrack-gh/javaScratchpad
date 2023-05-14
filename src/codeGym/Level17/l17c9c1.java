package codeGym.Level17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
A simple pattern
*/

public class l17c9c1 {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy, H:m");

        String text = dtf.format(localDateTime);

        System.out.println(text);
    }
}
