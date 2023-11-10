import java.util.Scanner;

public class Moocfi_31 {

    /*
     * Write a program that prompts the user for a password. If the password is
     * "Caput Draconis" the program prints "Welcome!". Otherwise, the program prints
     * "Off with you!"
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        String password;

        System.out.println("Password?");
        password = imput.nextLine();
        imput.close();

        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

    }
}
