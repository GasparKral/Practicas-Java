import java.util.Scanner;

public class Moocfi_7 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = imput.nextLine();

        System.out.println("Hi + " + name);
        imput.close();

    }
}
