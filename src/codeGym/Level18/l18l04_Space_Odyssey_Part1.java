package codeGym.Level18;

import java.util.ArrayList;

public class l18l04_Space_Odyssey_Part1 {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

        public static void main(String[] args) {
            createCrew();
            printCrewInfo();
        }

        public static void createCrew(){

            Human human1 = new Human();
            Human human2 = new Human();

            Dog dog = new Dog();
            Cat cat = new Cat();

            astronauts.add(human1);
            astronauts.add(human2);
            astronauts.add(dog);
            astronauts.add(cat);

        }

        public static void printCrewInfo() {
            System.out.println("The following crew members are on board: ");
            for (Astronaut astronaut : astronauts) {
                System.out.println(astronaut.getInfo());
            }
        }
    }

