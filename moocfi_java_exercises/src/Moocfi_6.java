import java.util.Scanner;

public class Moocfi_6 {

    /*
     * Write a program that asks the user to write a string. When the user has given
     * a string (that is, written some text and pressed enter), the program must
     * print the user's string three times (you can use the System.out.println
     * command multiple times).
     * 
     * The exercise template already includes the code that creates the Scanner
     * tool.
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        String text = imput.nextLine();

        System.out.println("Write a message:");
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);

        imput.close();

    }
}
