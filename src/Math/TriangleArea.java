package Math;

import java.util.Scanner;

public class TriangleArea {

    static double w;
    static double h;
    static double a;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter width and height of your triangle: ");
        w = sc.nextDouble();
        h = sc.nextDouble();

        a = (w * h) / 2;

        System.out.println("The ara of your triangle is: " + a + " units");
    }
}
