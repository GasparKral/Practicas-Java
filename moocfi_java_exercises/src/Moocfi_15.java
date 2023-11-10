import java.util.Scanner;

public class Moocfi_15 {

    /*
     * In the exercise template, implement a program that asks the user for the
     * number of days. After that, the program prints the number of seconds in the
     * given number of days.
     * 
     * Earlier we learned to read an integer in the following manner:
     * 
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.println("Give a number:");
     * int number = Integer.valueOf(scanner.nextLine());
     * System.out.println("You gave " + number);
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = imput.nextInt();
        System.out.println(days * 24 * 60 * 60);
        imput.close();

    }

}
