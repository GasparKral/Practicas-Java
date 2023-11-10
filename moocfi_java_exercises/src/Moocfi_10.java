public class Moocfi_10 {

    /*
     * The exercise template contains a program that prints the following:
     * 
     * Sample output
     * Chicken:
     * 3
     * Bacon (kg):
     * 5.5
     * Tractor:
     * None!
     * 
     * And finally, a summary:
     * 3
     * 5.5
     * None!
     * 
     * Modify the program in the given places so that it outputs the following:
     * 
     * Sample output
     * Chicken:
     * 9000
     * Bacon (kg):
     * 0.1
     * Tractor:
     * Zetor
     * 
     * And finally, a summary:
     * 9000
     * 0.1
     * Zetor
     */
    public static void main(String[] args) {

        int pollo = 9000;
        double bacon = 0.1;
        String tractor = "Zetor";

        System.out.println("Chiken:\n" + pollo);
        System.out.println("Bacon(Kg):\n" + bacon);
        System.out.println("Tractor:\n" + tractor + "\n");

        System.out.println("And finally, a summary:\n" + pollo + "\n" + bacon + "\n" + tractor);
    }
}
