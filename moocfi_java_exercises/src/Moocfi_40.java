import java.util.Scanner;

public class Moocfi_40 {

    /*
     * Write a program by using the loop example that asks "Shall we carry on?"
     * until the user inputs the string "no".
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        String text = "Shall we carry on?";
        String answer = "";

        while (true) {

            System.out.println(text);
            if (answer.equals("no")) {
                break;
            } else {
                answer = imput.nextLine();
            }
        }
        imput.close();

    }
}
