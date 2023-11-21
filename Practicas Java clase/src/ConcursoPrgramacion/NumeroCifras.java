package ConcursoPrgramacion;
import java.util.Scanner;
import java.util.ArrayList;

public class NumeroCifras {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {

            System.out.println("Ingresa un número o \"salir\" para terminar");
            String data = imput.nextLine();
            if (data.equals("salir")) {
                break;
            } else {
                numbers.add(Integer.parseInt(data));
            }
        }

        imput.close();

        for (int i = 0; i < numbers.size(); i++) {

            int number = numbers.get(i);
            int numberOfDigits = getNumberOfDigits(number);
            System.out.println("El número " + number + " tiene " + numberOfDigits + " cifras");
        }

    }

    private static int getNumberOfDigits(int number) {

        if (number == 0) {
            return 1;
        } else {
            return (int) (Math.log10(number) + 1);
        }
    }
}
