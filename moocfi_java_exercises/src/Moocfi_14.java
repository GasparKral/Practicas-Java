import java.util.Scanner;

public class Moocfi_14 {

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
