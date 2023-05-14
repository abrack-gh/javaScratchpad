package codeGym.Level17WorkingWithDateTime;
import java.time.LocalDate;
        import java.time.format.TextStyle;
        import java.util.Locale;

/*
Just a day of the week
*/

public class l17c4c2 {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {

        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
