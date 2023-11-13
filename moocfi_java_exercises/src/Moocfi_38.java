import java.util.Scanner;

public class Moocfi_38 {

    /*
     * Write a program that reads an integer from the user. If the number is less
     * than 0, the program prints the given integer multiplied by -1. In all other
     * cases, the program prints the number itself. A few examples of how the
     * program's expected to function are shown below:
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = imput.nextInt();
        imput.close();
        System.out.println(number < 0 ? number * -1 : number);

    }
}
