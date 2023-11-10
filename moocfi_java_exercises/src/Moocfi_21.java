import java.util.Scanner;

public class Moocfi_21 {

    /*
     * Write a program that asks the user for three integers and prints their
     * average.
     * 
     * Sample output
     * Give the first number:
     * 8
     * Give the second number:
     * 2
     * Give the third number:
     * 3
     * The average is 4.333333333333333
     * 
     * Sample output
     * Give the first number:
     * 9
     * Give the second number:
     * 5
     * Give the third number:
     * -1
     * The average is 4.333333333333333
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Give a number: ");
        double number = imput.nextInt();
        System.out.println("Give the second number:");
        double number2 = imput.nextInt();
        System.out.println("Give the third number:");
        double number3 = imput.nextInt();
        double average = (number + number2 + number3) / 3;
        imput.close();
        System.out.println("The average is " + average);

    }
}
