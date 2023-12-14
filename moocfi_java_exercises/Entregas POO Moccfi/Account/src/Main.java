public class Main {

    /*
     * Write a program that creates an account with a balance of 100.0, deposits
     * 20.0 in it, and finally prints the balance. NB! Perform all the operations in
     * this exact order.
     * 
     */

    /*
     * Creates an account named "Matthews account" with the balance 1000
     * Creates an account named "My account" with the balance 0
     * Withdraws 100.0 from Matthew's account
     * Deposits 100.0 to "my account"
     * Prints both the accounts
     */

    public static void main(String[] args) {

        Account artosAccount = new Account("Artos", "Macs", 100.0);
        Account matthews = new Account("Matthews", "Rolls", 1000.0);
        Account myAccount = new Account("Gaspar", "Kral", 0);

        artosAccount.deposit(20.0);

        System.out.println(artosAccount.toString());

        matthews.withdraw(100.0);

        myAccount.deposit(100.0);

        System.out.println(matthews.toString());
        System.out.println(myAccount.toString());
    }
}
