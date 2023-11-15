import java.util.Scanner;

public class Moocfi_45 {

    /*
     * Write a program that reads numbers from the user until the user inputs a
     * number 0. After this the program outputs the sum of the numbers. The number
     * zero does not need to be added to the sum, even if it does not change the
     * results.
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int control = 0;
        int number = 0;

        while (true) {

            System.out.println("Give a number: ");
            control = imput.nextInt();
            if (control == 0) {
                break;
            } else {
                number += control;
            }

        }
        imput.close();

        System.out.println("The sum of the numbers is: " + number);

    }
}
