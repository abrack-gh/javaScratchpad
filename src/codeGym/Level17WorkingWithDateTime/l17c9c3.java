package codeGym.Level17WorkingWithDateTime;


import java.time.LocalDateTime;
        import java.time.format.DateTimeFormatter;

/*
Write a pattern
*/

public class l17c9c3 {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("H:m:s dd/MM/yyyy");
    static String timeString = "13:30:45 11/01/2022";

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse(timeString, dateTimeFormatter);

        System.out.println(dateTime);
    }
}
