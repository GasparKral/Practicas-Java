import java.util.Scanner;

public class Moocfi_37 {

    /*
     * Write a program that reads two integers from the user and prints the square
     * root of the sum of these integers. The program does not need to work with
     * negative values.
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = imput.nextInt();
        System.out.println("Give another number: ");
        int number2 = imput.nextInt();
        imput.close();

        System.out.println(Math.sqrt(number + number2));

    }
}
