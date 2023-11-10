import java.util.Scanner;

public class Moocfi_30 {

    /*
     * Write a program that prompts the user for a number and informs us whether it
     * is even or odd.
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int number;
        System.out.println("Give a number:");
        number = imput.nextInt();
        imput.close();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }
}
