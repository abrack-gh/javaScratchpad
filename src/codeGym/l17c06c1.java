package codeGym;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/*
Synthesizing a LocalDateTime
*/

public class l17c06c1 {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> result = new HashSet<>();

        for(Map.Entry<LocalDate, List<LocalTime>> entry : sourceMap.entrySet()){
            for(LocalTime time : entry.getValue()){
                result.add(LocalDateTime.of(entry.getKey(), time));
            }
        }

        return result;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}
