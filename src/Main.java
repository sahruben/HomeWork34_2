import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("123456789", 1000.0);

        myAccount.deposit(500.0);
        myAccount.deposit(200.0);
        myAccount.deposit(100.0);

        System.out.println("Номер счета: " + myAccount.getAccountNumber());
        System.out.println("Текущий баланс: " + myAccount.getBalance());
        System.out.println("Суммы пополнений: " + Arrays.toString(myAccount.getDepositAmounts()));
    }
}

