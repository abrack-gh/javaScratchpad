package Math;

import java.math.BigInteger;
import java.util.Scanner;

public class MaximumNumber {

    public static void main(String ags[]){

        Float a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input your numbers: ");

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        Float temp=a>b?a:b;

        Float largest = c > temp?c:temp;

        System.out.println("Largest number is: " +largest);


    }
}
