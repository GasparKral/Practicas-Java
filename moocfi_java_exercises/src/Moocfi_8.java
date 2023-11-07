import java.util.Scanner;

public class Moocfi_8 {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        String text1 = "Greetings! How are you doing?";
        String text2 = "Oh, how interesting. Tell me more!";
        String text3 = "Thanks for sharing!";
        String dataCell = "";

        System.out.println(text1);
        dataCell = imput.nextLine();
        System.out.println(text2);
        dataCell = imput.nextLine();
        System.out.println(text3);

        imput.close();
    }

}
