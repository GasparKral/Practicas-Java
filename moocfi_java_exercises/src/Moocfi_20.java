import java.util.Scanner;

public class Moocfi_20 {

    /*
     * Write a program that asks the user for two integers and prints their average.
     * 
     * Sample output
     * Give the first number:
     * 8
     * Give the second number:
     * 2
     * The average is 5.0
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Give a number: ");
        double number = imput.nextInt();
        System.out.println("Give the second number:");
        double number2 = imput.nextInt();
        double average = (number + number2) / 2;
        imput.close();
        System.out.println("The average is " + average);

    }
}
