import java.util.Scanner;

public class Moocfi_48 {

    /*
     * Write a program that asks the user for input until the user inputs 0. After
     * this, the program prints the average of the positive numbers (numbers that
     * are greater than zero).
     * 
     * If no positive number is inputted, the program prints
     * "Cannot calculate the average"
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        int counter = 0;

        while (true) {

            System.out.println("Give a number: ");
            number = imput.nextInt();
            if (number == 0) {
                break;
            } else if (number > 0) {
                sum += number;
                counter++;
            }

        }

        imput.close();

        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("The average is: " + sum / counter);
        }

    }
}
