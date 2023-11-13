import java.util.Scanner;

public class Moocfi_39 {

    /*
     * Write a program that reads two integers from the user. If the first number is
     * greater than the second, the program prints
     * "(first) is greater than (second)." If the first number is less than the
     * second, the program prints "(first) is smaller than (second)." Otherwise, the
     * program prints "(first) is equal to (second)." The (first) and (second)
     * should always be replaced with the actual numbers that were provided by the
     * user.
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("Give the first number:");
        int number = imput.nextInt();
        System.out.println("Give the second number:");
        int number2 = imput.nextInt();
        imput.close();

        if (number > number2) {
            System.out.println(number + " is greater than " + number2);
        } else if (number < number2) {
            System.out.println(number + " is smaller than " + number2);
        } else {
            System.out.println(number + " is equal to " + number2);
        }

    }
}
