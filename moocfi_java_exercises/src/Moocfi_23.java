import java.util.Scanner;

public class Moocfi_23 {

    /*
     * Write a program that asks the user for an integer and prints the string
     * "Speeding ticket!" if the input is greater than 120.
     * 
     * Sample output
     * Give speed:
     * 15
     * 
     * Sample output
     * Give speed:
     * 135
     * Speeding ticket!
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Give speed");
        int speed = imput.nextInt();
        imput.close();

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }

    }
}
