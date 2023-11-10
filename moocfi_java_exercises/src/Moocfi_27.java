import java.util.Scanner;

public class Moocfi_27 {

    /*
     * Write a program that prompts the user for their age and tells them whether or
     * not they are an adult (18 years old or older).
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int number;

        System.out.println("How old are you? ");
        number = imput.nextInt();
        imput.close();

        if (number >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

    }
}
