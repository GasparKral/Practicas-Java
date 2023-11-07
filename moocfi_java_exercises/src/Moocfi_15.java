import java.util.Scanner;

public class Moocfi_15 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = imput.nextInt();
        System.out.println(days * 24 * 60 * 60);
        imput.close();

    }

}
