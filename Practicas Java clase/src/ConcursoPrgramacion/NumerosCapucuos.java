package ConcursoPrgramacion;
import java.util.Scanner;
import java.util.ArrayList;

public class NumerosCapucuos {

    public static void main(String[] args) {

        String data;
        Scanner imput = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<>();
        String numInverted;

        while (true) {

            System.out.println("Ingresa un número o \"salir\" para terminar");
            data = imput.nextLine();
            if (data.equals("salir")) {
                break;
            } else {
                numbers.add(data);
            }
        }

        imput.close();
        System.out.println("");

        for (String number : numbers) {

            numInverted = invertNumber(number);
            if (number.equals(numInverted)) {
                System.out.println(number + " es capicua");
            } else {
                System.out.println(number + " no es capicua");

            }
        }
    }

    private static String invertNumber(String number) {

        int numInverted = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            numInverted = numInverted * 10 + Character.getNumericValue(number.charAt(i));
        }
        return Integer.toString(numInverted);
    }
}
