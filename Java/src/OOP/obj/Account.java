package OOP.obj;

public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Сумма превышает баланс");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "Номер счета=" + accountNumber +
                ", Баланс=$" + balance +
                '}';
    }
}

class TestAccount {
    public static void main(String[] args) {
        Account a = new Account(10, 1000);
        a.credit(10);
        a.debit(200);
        System.out.println(a.toString());
    }
}
