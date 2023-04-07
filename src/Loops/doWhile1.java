package Loops;

import java.util.Scanner;

public class doWhile1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String string = scanner.nextLine();
        System.out.println("How many times do you want to repeat?");
        int number = scanner.nextInt();

        //print out string while(if) the inputted number is <= number

        do{
            System.out.println(string);
            number--;
        } while (number > 0 && number < 10);



        }

}


