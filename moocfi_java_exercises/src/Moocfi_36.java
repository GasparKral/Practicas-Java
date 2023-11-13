import java.util.Scanner;

public class Moocfi_36 {

    /*
     * Write a program that reads an integer from the user and prints the square of
     * the given integer, i.e. the integer multiplied by itself.
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int number;

        System.out.println("Give a number: ");
        number = imput.nextInt();
        imput.close();
        System.out.println((number * number));
    }
}