import java.util.Scanner;

public class Moocfi_11 {

    /*
     * Write a program that asks the user for a value. The program should then print
     * the value provided by the user.
     * 
     * Here's a couple of examples:
     * 
     * Sample output
     * Give a number:
     * 3
     * You gave the number 3
     * 
     * Sample output
     * Give a number:
     * 42
     * You gave the number 42
     */
    public static void main(String[] args) {

        int num1;
        Scanner imput = new Scanner(System.in);

        System.out.println("Give a number:");
        num1 = imput.nextInt();
        System.out.println("You gave the number " + num1);
        imput.close();

    }
}
