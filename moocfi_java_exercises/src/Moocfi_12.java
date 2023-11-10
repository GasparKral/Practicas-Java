import java.util.Scanner;

public class Moocfi_12 {

    /*
     * Write a program that asks the user for a floating-point number using the
     * variable type Double. The program then prints the user's input value.
     * 
     * Example prints for the program can be seen below:
     * 
     * Sample output
     * Give a number:
     * 3.14
     * You gave the number 3.14
     * 
     * Sample output
     * Give a number:
     * 2.718
     * You gave the number 2.718
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        Double number;

        System.out.println("Give me a number:");
        number = imput.nextDouble();
        System.out.println("You gave the number " + number);
        imput.close();

    }
}
