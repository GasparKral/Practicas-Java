import java.util.Scanner;

public class Moocfi_12 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        Double number;

        System.out.println("Give me a number:");
        number = imput.nextDouble();
        System.out.println("You gave the number " + number);
        imput.close();

    }
}
