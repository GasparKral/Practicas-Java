import java.util.Scanner;

public class Moocfi_28 {

    /*
     * Write a program that prompts the user for two integers and prints the larger
     * of the two. If the numbers are the same, then the program informs us about
     * this as well.
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int number1, number2;

        System.out.println("Give a number: ");
        number1 = imput.nextInt();

        System.out.println("Give the second number: ");
        number2 = imput.nextInt();

        imput.close();

        if (number1 > number2) {
            System.out.println("The greater number is: " + number1);
        } else if (number1 < number2) {
            System.out.println("The greater number is: " + number2);
        } else {
            System.out.println("The numbers are equal");
        }

    }
}
