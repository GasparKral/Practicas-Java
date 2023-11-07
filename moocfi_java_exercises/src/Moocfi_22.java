import java.util.Scanner;

public class Moocfi_22 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Give a number: ");
        double number = imput.nextInt();
        System.out.println("Give the second number:");
        double number2 = imput.nextInt();
        imput.close();

        System.out.println(number + " + " + number2 + " = " + (number + number2));
        System.out.println(number + " - " + number2 + " = " + (number - number2));
        System.out.println(number + " * " + number2 + " = " + (number * number2));
        System.out.println(number + " / " + number2 + " = " + (number / number2));

    }
}