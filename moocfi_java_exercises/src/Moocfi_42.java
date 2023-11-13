import java.util.Scanner;

public class Moocfi_42 {

    /*
     * Write a program that asks the user for numbers. If the number is negative
     * (smaller than zero), the program prints for user "Unsuitable number" and asks
     * the user for a new number. If the number is zero, the program exits the loop.
     * If the number is positive, the program prints the number to the power of two.
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int number;

        while (true) {

            System.out.println("Give a number: ");
            number = imput.nextInt();

            if (number > 0) {
                System.out.println(number * number);

            } else if (number < 0) {
                System.out.println("Unsuitable number");

            } else {
                break;
            }
        }
        imput.close();
    }
}
