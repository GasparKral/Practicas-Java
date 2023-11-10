import java.util.Scanner;

public class Moocfi_32 {

    /*
     * Write a program that prompts the user for two strings. If the strings are the
     * same, then the program prints "Same". Otherwise, it prints "Different".
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        String string1, string2;

        System.out.println("Enter the first String: ");
        string1 = imput.nextLine();
        System.out.println("Enter the second String: ");
        string2 = imput.nextLine();
        imput.close();

        if (string1.equals(string2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
