import java.util.Scanner;

public class Moocfi_33 {

    /*
     * Write a program that prompts the user to input their age and checks whether
     * or not it is possible (at least 0 and at most 120). Only use a single
     * if-command in your program.
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int age;

        System.out.println("How old are you?");
        age = imput.nextInt();
        imput.close();

        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }

}