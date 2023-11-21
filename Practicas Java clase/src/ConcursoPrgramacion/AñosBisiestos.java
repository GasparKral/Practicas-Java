package ConcursoPrgramacion;
import java.util.Scanner;
import java.util.ArrayList;

public class AñosBisiestos {

    public static void main(String[] args) {

        String data;
        Scanner imput = new Scanner(System.in);
        ArrayList<Integer> years = new ArrayList<>();

        while (true) {

            System.out.println("Ingresa los años a comprobar si son bisiestos o \"Salir\" para terminar");
            data = imput.nextLine();
            if (data.equals("Salir")) {
                break;
            } else {
                years.add(Integer.parseInt(data));
            }
        }

        imput.close();
        System.out.println("");

        for (int i = 0; i < years.size(); i++) {

            if (esMultiploDe4(years.get(i)) && (esMultiploDe100(years.get(i)) || esMultiploDe400(years.get(i)))) {
                System.out.println(years.get(i) + " es bisiesto");
            } else {
                System.out.println(years.get(i) + " no es bisiesto");
            }
        }

        System.out.println("");
    }

    private static Boolean esMultiploDe4(int year) {

        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }

    private static Boolean esMultiploDe100(int year) {

        if (year % 100 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static Boolean esMultiploDe400(int year) {

        if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
