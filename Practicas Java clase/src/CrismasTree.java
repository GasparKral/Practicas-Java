import java.util.Scanner;

public class CrismasTree {

    public static void main(String[] args) throws Exception {

        Scanner imput = new Scanner(System.in);
        char simbolo = '*';
        int altura;

        while (true) {

            System.out.println("Ingresa la altura");
            altura = imput.nextInt();
            if (altura < 4) {
                System.out.println("Ingresa una altura mayor a 4");
            } else {
                break;
            }

        }

        imput.close();

    }
}
