import java.util.Scanner;

public class Moocfi_47 {

    /*
     * Write a program that asks the user for input until the user inputs 0. After
     * this, the program prints the average of the numbers. The number zero does not
     * need to be counted to the average. You may assume that the user inputs at
     * least one number.
     * 
     * The average of the numbers can be calculated by dividing the sum of numbers
     * with the amount of the numbers
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int counter = 0;
        int acumulator = 0;
        int number;

        while (true) {

            System.out.println("Give a number: ");
            number = imput.nextInt();
            if (number == 0) {
                break;
            } else {
                acumulator += number;
                counter++;
            }

        }

        imput.close();

        System.out.println("Averege: " + acumulator / counter);
    }
}
