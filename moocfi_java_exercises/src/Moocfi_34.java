import java.util.Scanner;

public class Moocfi_34 {

    /*
     * A year is a leap year if it is divisible by 4. However, if the year is
     * divisible by 100, then it is a leap year only when it is also divisible by
     * 400.
     * 
     * Write a program that reads a year from the user, and checks whether or not it
     * is a leap year.
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int year;

        System.out.println("Give a year:");
        year = imput.nextInt();
        imput.close();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            } else {
                System.out.println(year + " is a leap year");
            }
        } else {
            System.out.println(year + " is not a leap year");
        }

    }
}
