import java.util.Scanner;

public class Moocfi_17 {

    /*
     * Write a program that asks the user for three numbers. After this the program
     * prints the sum of the numbers given by the user.
     * 
     * The program should work like this:
     * 
     * Sample output
     * Give the first number:
     * 8
     * Give the second number:
     * 3
     * Give the third number:
     * 3
     * The sum of the numbers is 14
     * 
     * Sample output
     * Give the first number:
     * 3
     * Give the second number:
     * -1
     * Give the third number:
     * 2
     * The sum of the numbers is 4
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = imput.nextInt();
        System.out.println("Give the second number:");
        int number2 = imput.nextInt();
        System.out.println("Give a third number:");
        int number3 = imput.nextInt();
        System.out.println("The sum of the numbers is " + (number + number2 + number3));
        imput.close();

    }
}
