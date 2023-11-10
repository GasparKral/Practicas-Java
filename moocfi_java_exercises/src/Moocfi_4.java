import java.util.Scanner;

public class Moocfi_4 {

    /*
     * Write a program that asks the user to write a string. When the user has
     * provided a string (i.e., written some text and pressed the enter key), the
     * program should print the string that was provided by the user.
     * 
     * The exercise template comes with a program template that includes the
     * creation of a Scanner tool.
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Write a message:");
        String text = imput.nextLine();
        System.out.println(text);
        imput.close();
    }
}
