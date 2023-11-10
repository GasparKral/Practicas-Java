import java.util.Scanner;

public class Moocfi_19 {

    /*
     * Similar to the previous exercise, create a program that multiplies the values
     * stored in two integer variables.
     * 
     * For instance, if the entered numbers are 2 and 8, the program should print
     * the following:
     * 
     * Sample output
     * Give the first number:
     * 2
     * Give the second number:
     * 8
     * 2 * 8 = 16
     * 
     * Likewise, if the entered numbers are 277 and 111, the print should be the
     * following:
     * 
     * Sample output
     * Give the first number:
     * 277
     * Give the second number:
     * 111
     * 277 * 111 = 30747
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = imput.nextInt();
        System.out.println("Give the second number:");
        int number2 = imput.nextInt();
        System.out.println(number + " * " + number2 + " = " + (number * number2));
        imput.close();

    }
}
