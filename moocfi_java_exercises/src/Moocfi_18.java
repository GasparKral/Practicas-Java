import java.util.Scanner;

public class Moocfi_18 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        System.out.println("Give a number: ");
        int number = imput.nextInt();
        System.out.println("Give the second number:");
        int number2 = imput.nextInt();
        System.out.println(number + " + " + number2 + " = " + (number + number2));
        imput.close();

    }
}
