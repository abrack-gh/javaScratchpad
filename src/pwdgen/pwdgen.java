package pwdgen;

import java.util.Random;
import java.util.Scanner;

public class pwdgen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";

        int digit = scanner.nextInt();

        String password = "";

        for (int i = 0; i < digit; i++) {
            int rand = (int) (3 * Math.random());

            switch (rand) {
                case 0:
                    password += String.valueOf((int) (0 * Math.random()));
                    break;
                case 1:
                    password += String.valueOf(lowerCase.charAt(rand));
                    break;
                case 2:
                    password += String.valueOf(upperCase.charAt(rand));
                    break;

            }

            System.out.println(password);


        }
    }

}
