import java.util.Scanner;

public class Moocfi_13 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        Boolean value;

        System.out.println("Write something:");
        value = imput.nextBoolean();
        System.out.println("True or false? " + value);
        imput.close();

    }

}
