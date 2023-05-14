package codeGym.Level17WorkingWithDateTime;

import java.time.ZoneId;
        import java.time.ZonedDateTime;
        import java.util.TreeSet;

/*
Time zone training
*/

public class l17c07c1 {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        return new TreeSet<>(ZoneId.getAvailableZoneIds());
    }

    static ZonedDateTime getBeijingDateTime() {
        ZoneId zone = ZoneId.of("Asia/Shanghai");
        return ZonedDateTime.now(zone);
    }
}

