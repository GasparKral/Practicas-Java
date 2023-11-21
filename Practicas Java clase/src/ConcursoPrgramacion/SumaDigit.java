package ConcursoPrgramacion;
import java.util.Scanner;
import java.util.ArrayList;

public class SumaDigit {

    public static void main(String[] args) {

        String data;
        Scanner imput = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {

            System.out.println("Ingresa un número o \"salir\" para terminar");
            data = imput.nextLine();
            if (data.equals("salir")) {
                break;
            } else {
                numbers.add(Integer.parseInt(data));
            }
        }

        imput.close();

        for (Integer number : numbers) {

            System.out.println("La suma de los digitos de " + number + " es: " + sumaDigitos(number));

        }

    }

    private static int sumaDigitos(int number) {

        if (number == 0) {
            return 0;
        } else {
            return number % 10 + sumaDigitos(number / 10);
        }

    }

}
