import java.util.Scanner;

public class Moocfi_18 {

    /*
     * Create a program that can be used to add two integers together. In the
     * beginning, the user is asked to give two integers that are to be summed. The
     * program then prints the formula that describes the addition of the numbers.
     * 
     * Example output:
     * 
     * Sample output
     * Give the first number:
     * 5
     * Give the second number:
     * 4
     * 5 + 4 = 9
     * 
     * Sample output
     * Give the first number:
     * 73457
     * Give the second number:
     * 12888
     * 73457 + 12888 = 86345
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = imput.nextInt();
        System.out.println("Give the second number:");
        int number2 = imput.nextInt();
        System.out.println(number + " + " + number2 + " = " + (number + number2));
        imput.close();

    }
}
