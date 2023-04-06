package Loops;

import java.util.Scanner;

public class whileLoop2 {

    public static void main(String[] args){

        //Scanner for name input.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        String text = " loves me.";

        //Concatenate name and text

        String result = name + " " + text;

        //Loop for printing result n times.

        int i = 1;

        while(i <= 10){
            System.out.println(result);
            i++;
    }
    }
}
