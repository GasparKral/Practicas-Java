import java.util.Scanner;

public class Moocfi_7 {

    /*
     * Write a program that prompts the user for their name with the message
     * "What's your name?". When the user has written their name, the program has to
     * print "Hi " followed by the user's name.
     * 
     * The exercise template already includes the code that creates the Scanner
     * tool.
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = imput.nextLine();

        System.out.println("Hi + " + name);
        imput.close();

    }
}
