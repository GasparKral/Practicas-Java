public class Account {

    private String name, surname;
    private double balance;

    public Account(String name, String surname, double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    public String showBalance() {

        return this.balance + "€";
    }

    public void deposit(double amount) {

        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getName() + " " +
                getSurname() + ": " +
                showBalance();
    }

}
