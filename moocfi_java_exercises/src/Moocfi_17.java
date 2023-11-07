import java.util.Scanner;

public class Moocfi_17 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = imput.nextInt();
        System.out.println("Give the second number:");
        int number2 = imput.nextInt();
        System.out.println("Give a third number:");
        int number3 = imput.nextInt();
        System.out.println("The sum of the numbers is " + (number + number2 + number3));
        imput.close();

    }
}
