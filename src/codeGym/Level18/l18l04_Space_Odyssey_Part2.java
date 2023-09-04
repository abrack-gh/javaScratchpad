package codeGym.Level18;

import java.util.ArrayList;

/*
Space Odyssey Part 2
*/

public class l18l04_Space_Odyssey_Part2 {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        performWork();
    }

    public static void performWork() {
        Human human1 = (Human) astronauts.get(0);
        pilot(human1);

        Human human2 = (Human) astronauts.get(1);
        pilot(human2);

        Dog dog = (Dog) astronauts.get(2);
        chartCourse(dog);

        Cat cat = (Cat) astronauts.get(3);
        research(cat);
    }

    public static void pilot(Human human) {
        System.out.println("Crew member " + human.getInfo() + " is piloting the ship.");
    }

    public static void chartCourse(Dog dog) {
        System.out.println("Crew member " + dog.getInfo() + " is charting a course.");
    }

    public static void research(Cat cat){
        System.out.println("Crew member " + cat.getInfo() + " is researching nearby planets.");
    }

    public static void createCrew() {
        astronauts.add(new Human());
        astronauts.add(new Human());
        astronauts.add(new Dog());
        astronauts.add(new Cat());
    }

    public static void printCrewInfo() {
        System.out.println("The following crew members are on board: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
