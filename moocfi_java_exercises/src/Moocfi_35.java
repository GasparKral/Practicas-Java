import java.util.Scanner;

public class Moocfi_35 {

    /*
     * https://www.vero.fi/en/individuals/property/gifts/: A gift is a transfer of
     * property to another person against no compensation or payment. If the total
     * value of the gifts you receive from the same donor in the course of 3 years
     * is €5,000 or more, you must pay gift tax.
     * 
     * When a gift is given by a close relative or a family member, the amount of
     * gift tax is determined by the following table (source vero.fi):
     */

    public static void main(String[] args) {

        Scanner imput = new Scanner(System.in);
        Double giftValue;
        double minValues[] = { 1000000, 200000, 55000, 25000, 5000 };
        // int maxValues[] = { 1000000, 200000, 55000, 25000 };
        double taxValue[] = { 17, 15, 12, 10, 8 };
        double minTaxvalue[] = { 142100, 22100, 4700, 1700, 100 };

        System.out.println("Value of the gift?");
        giftValue = imput.nextDouble();
        imput.close();

        if (giftValue < minValues[0]) {
            System.out.println("No tax!");
        } else {
            for (int i = 0; i < minValues.length; i++) {

                if (giftValue >= minValues[i]) {

                    if (giftValue == minTaxvalue[i]) {

                        System.out.println("Tax:" + minTaxvalue[i] + "€");
                        break;

                    } else {

                        System.out.println(
                                "Tax:" + (minTaxvalue[i] + ((giftValue - minValues[i]) * (taxValue[i]) / 100)) + "€");
                        break;

                    }

                }
            }
        }

    }
}
