import java.util.Scanner;

public class Moocfi_41 {

    /*
     * Write a program, according to the preceding example, that asks the user to
     * input values until they input the value 4.
     */
    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        String text = "Give a number: ";
        int answer = 0;

        while (true) {

            if (answer == 4) {
                break;
            } else {

                System.out.println(text);
                answer = imput.nextInt();
            }
        }
        imput.close();
    }
}
