import java.util.Scanner;

public class Moocfi_46 {
    /*
     * Write a program that asks the user for input until the user inputs 0. After
     * this the program prints the amount of numbers inputted and the sum of the
     * numbers. The number zero does not need to be added to the sum, but adding it
     * does not change the results.
     * 
     * You need two variables to keep track of the information. Use one for keeping
     * track of the numbers inputted and other for keeping track of the sum
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int acumulator = 0;
        int control = 0;
        int number = 0;

        while (true) {

            System.out.println("Give a number: ");
            control = imput.nextInt();
            if (control == 0) {
                break;
            } else {
                number += control;
                acumulator++;
            }
        }

        imput.close();
        System.out.println("Number of numbers: " + acumulator);
        System.out.println("The sum of the numbers is: " + number);
    }
}
