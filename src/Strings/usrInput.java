package Strings;

import java.util.Scanner;

public class usrInput {

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        System.out.println("Hi, what is your name: ");
        String name = console.nextLine();
        System.out.println("And what is your age?");
        int age = console.nextInt();

        System.out.println("Hi, " + name + ". You are " + age + " years old!");

    }


}
