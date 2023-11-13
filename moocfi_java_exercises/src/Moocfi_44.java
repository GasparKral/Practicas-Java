import java.util.Scanner;

public class Moocfi_44 {

    /*
     * Write a program that reads values from the user until they input a 0. After
     * this, the program prints the total number of inputted values that are
     * negative. The zero that's used to exit the loop should not be included in the
     * total number count.
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int count = 0;
        int number;

        while (true) {

            System.out.println("Give a number: ");
            number = imput.nextInt();
            if (number == 0) {
                break;
            } else if (number < 0) {
                count++;
            } else {
                continue;

            }
        }
        imput.close();
        System.out.println("Number of negative numbers: " + count);

    }
}
