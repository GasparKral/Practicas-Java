import java.util.Scanner;

public class Moocfi_14 {

    /*
     * Write a program that asks the user for a string, an integer, a floating-point
     * number, and a boolean. The program should then print the values given by the
     * user.
     * 
     * Example prints for the program can be seen below.
     * 
     * Sample output
     * Give a string:
     * bye-bye
     * Give an integer:
     * 11
     * Give a double:
     * 4.2
     * Give a boolean:
     * true
     * You gave the string bye-bye
     * You gave the integer 11
     * You gave the double 4.2
     * You gave the boolean true
     * 
     * Sample output
     * Give a string:
     * Oops!
     * Give an integer:
     * -4
     * Give a double:
     * 3200.1
     * Give a boolean:
     * false
     * You gave the string Oops!
     * You gave the integer -4
     * You gave the double 3200.1
     * You gave the boolean false
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        String text;
        int number1;
        Double number2;
        Boolean value;

        System.out.println("Give a string:");
        text = imput.nextLine();
        System.out.println("Give an integer:");
        number1 = imput.nextInt();
        System.out.println("Give a double:");
        number2 = imput.nextDouble();
        System.out.println("Give a boolean:");
        value = imput.nextBoolean();

        imput.close();

        System.out.println("You gave the string" + text);
        System.out.println("You gave the integer" + number1);
        System.out.println("You gave the double" + number2);
        System.out.println("You gave the boolean" + value);

    }
}
