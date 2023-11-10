import java.util.Scanner;

public class Moocfi_22 {

    /*
     * Write a program that asks the user for two numbers and prints their sum,
     * difference, product, and quotient. Two examples of the execution of the
     * program are given below.
     * 
     * Sample output
     * Give the first number:
     * 8
     * Give the second number:
     * 2
     * 8 + 2 = 10
     * 8 - 2 = 6
     * 8 * 2 = 16
     * 8 / 2 = 4.0
     * 
     * Sample output
     * Give the first number:
     * 9
     * Give the second number:
     * 2
     * 9 + 2 = 11
     * 9 - 2 = 7
     * 9 * 2 = 18
     * 9 / 2 = 4.5
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Give a number: ");
        double number = imput.nextInt();
        System.out.println("Give the second number:");
        double number2 = imput.nextInt();
        imput.close();

        System.out.println(number + " + " + number2 + " = " + (number + number2));
        System.out.println(number + " - " + number2 + " = " + (number - number2));
        System.out.println(number + " * " + number2 + " = " + (number * number2));
        System.out.println(number + " / " + number2 + " = " + (number / number2));

    }
}