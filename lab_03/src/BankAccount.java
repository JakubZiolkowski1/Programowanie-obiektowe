public class BankAccount {
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    private String owner;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
        }
    }
}
