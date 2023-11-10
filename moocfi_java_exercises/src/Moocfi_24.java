import java.util.Scanner;

public class Moocfi_24 {

    /*
     * Write a program that prompts the user for an integer and prints the string
     * "Orwell" if the number is exactly 1984.
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int number;

        System.out.println("Give a number: ");
        number = imput.nextInt();
        imput.close();

        if (number == 1984) {
            System.out.println("Orwell");
        }

    }

}
