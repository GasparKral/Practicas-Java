import java.util.Scanner;

public class Moocfi_26 {

    /*
     * Write a program that prompts the user for an integer and informs the user
     * whether or not it is positive (greater than zero).
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int number;

        System.out.println("Give a number: ");
        number = imput.nextInt();
        imput.close();

        if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }

    }
}
