public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;
    private double interestRate;

    public BankAccount(String accountNumber, String accountHolder, double balance, String accountType, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        // Реализация метода внесения денег
    }

    public void withdraw(double amount) {
        // Реализация метода снятия денег
    }

    public void calculateInterest() {
        // Реализация метода расчета процентов
    }
}
