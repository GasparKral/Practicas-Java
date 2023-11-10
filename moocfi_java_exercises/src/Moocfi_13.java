import java.util.Scanner;

public class Moocfi_13 {

    /*
     * Write a program that asks the user for a boolean value. The program should
     * then print the value provided by the user.
     * 
     * Example prints for the program can be seen below.
     * 
     * Sample output
     * Write something:
     * santa does not exist
     * True or false? false
     * 
     * Sample output
     * Write something:
     * TRUE
     * True or false? true
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        Boolean value;

        System.out.println("Write something:");
        value = imput.nextBoolean();
        System.out.println("True or false? " + value);
        imput.close();

    }

}
