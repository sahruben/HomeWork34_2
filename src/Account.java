import java.util.Arrays;

public class Account {
    private String accountNumber;
    private double balance;
    private double[] depositAmounts;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.depositAmounts = new double[0];
    }

    public String getAccountNumber()

    {
        return accountNumber;
    }

    public

    void

    setAccountNumber(String accountNumber)

    {
        this.accountNumber = accountNumber;
    }

    public

    double

    getBalance()

    {
        return balance;
    }

    public

    void

    setBalance(double balance)

    {
        this.balance = balance;
    }

    public

    double[] getDepositAmounts() {
        return depositAmounts;
    }

    public

    void

    setDepositAmounts(double[] depositAmounts)

    {
        this.depositAmounts = depositAmounts;
    }

    public void deposit(double amount) {
        balance += amount;

        double[] newDepositAmounts = new double[depositAmounts.length + 1];
        System.arraycopy(depositAmounts, 0, newDepositAmounts, 0, depositAmounts.length);
        newDepositAmounts[depositAmounts.length] = amount;
        depositAmounts = newDepositAmounts;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Сумма списания превышает баланс");
            return;
        }

        balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("Account (номер счёта: %s, баланс: %s, суммы пополнений: %s)", accountNumber, balance, Arrays.toString(depositAmounts));
    }
}
