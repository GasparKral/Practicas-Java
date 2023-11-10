import java.util.Scanner;

public class Moocfi_25 {

    /*
     * Write a program that prompts the user for a year. If the user inputs a number
     * that is smaller than 2015, then the program prints the string
     * "Ancient history!".
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int number;

        System.out.println("Give a year: ");
        number = imput.nextInt();
        imput.close();

        if (number == 2013) {
            System.out.println("Ancient history!");
        }

    }

}
