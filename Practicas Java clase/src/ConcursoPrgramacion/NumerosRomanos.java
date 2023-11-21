package ConcursoPrgramacion;

import java.util.Scanner;
import java.util.ArrayList;

public class NumerosRomanos {

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        int number;

        System.out.println("Give a number: ");
        number = imput.nextInt();
        imput.close();

        System.out.println(number + " en numeros romanos es " + romanNumerals(number));
    }

    public static String romanNumerals(int number) {

        Integer[] factors = factorizeNumber(number);
        String result = "";
        String romanSybols[] = { "M", "D", "C", "L", "X", "V", "I" };
        int times;
        for (Integer numbers : factors) {

            if (numbers == 1000) {
                times = checkNextDatas(number);
                result += repeat(romanSybols[0], romanSybols[0], times);
            } else if (numbers == 500) {
                times = checkNextDatas(number);
                result += repeat(romanSybols[1], romanSybols[0], times);
            } else if (numbers == 100) {
                times = checkNextDatas(number);
                result += repeat(romanSybols[2], romanSybols[1], times);
            } else if (numbers == 50) {
                times = checkNextDatas(number);
                result += repeat(romanSybols[3], romanSybols[2], times);
            } else if (numbers == 10) {
                times = checkNextDatas(number);
                result += repeat(romanSybols[4], romanSybols[3], times);
            } else if (numbers == 5) {
                times = checkNextDatas(number);
                result += repeat(romanSybols[5], romanSybols[4], times);
            } else if (numbers == 1) {
                times = checkNextDatas(number);
                result += repeat(romanSybols[6], romanSybols[5], times);
            }

        }
        return result;
    }

    protected static Integer[] factorizeNumber(int number) {
        ArrayList<Integer> factorizedNumber = new ArrayList<>();

        while (number >= 1000) {
            factorizedNumber.add(1000);
            number -= 1000;
        }
        while (number >= 500) {
            factorizedNumber.add(500);
            number -= 500;
        }
        while (number >= 100) {
            factorizedNumber.add(100);
            number -= 100;
        }
        while (number >= 50) {
            factorizedNumber.add(50);
            number -= 50;
        }
        while (number >= 10) {
            factorizedNumber.add(10);
            number -= 10;
        }
        while (number >= 5) {
            factorizedNumber.add(5);
            number -= 5;
        }
        while (number >= 1) {
            factorizedNumber.add(1);
            number -= 1;
        }

        return factorizedNumber.toArray(new Integer[factorizedNumber.size()]);
    }

    protected static Integer checkNextDatas(int number) {
        if (number - 3 == number) {
            return 4;
        } else if (number - 2 == number) {
            return 3;
        } else if (number - 1 == number) {
            return 2;
        } else {
            return 1;
        }
    }

    protected static String repeat(String symbol, String symbolAnterior, int times) {
        if (times < 4) {
            return symbol.repeat(times);
        } else {
            return symbol + repeat(symbolAnterior, symbolAnterior, times - 1);
        }
    }
}
