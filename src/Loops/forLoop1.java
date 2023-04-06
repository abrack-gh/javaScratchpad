package Loops;

import java.util.Scanner;

public class forLoop1 {

    public static void main(String[] args) {

        //User input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");

        // n = above input

        int n = sc.nextInt();

        //Loop through n ^ times and print out Hello

        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
    }
}
