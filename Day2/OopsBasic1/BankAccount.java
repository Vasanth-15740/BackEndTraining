//Write a class BankAccount with private attributes for accountNumber and balance. Provide public methods to deposit, withdraw, and check the balance.

package Day2.OopsBasic1;
import java.util.Scanner;
public class BankAccount {
    private static int AccountNumber;
    private static int AccountBalance;

    public BankAccount(int AccountNumber) {
        this.AccountNumber = AccountNumber;
        this.AccountBalance = 1000;
    }

public int deposit(int amount) {
    return AccountBalance +=amount;
}
public int withdraw(int amount) {
    return AccountBalance-=amount;
}
public int checkBalance() {
    return AccountBalance;
}
 public static void main(String[] args) {
     BankAccount account = new BankAccount(AccountNumber);
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int AccountNumber = sc.nextInt();
        System.out.print("Enter 1 to Deposit 2 to withdraw 3 to check balance: ");
        int amount = sc.nextInt();
        if (amount == 1) {
            System.out.println("Enter amount to deposit: ");
            amount = sc.nextInt();
            account.deposit(amount);
        } else if (amount == 2) {
            System.out.println("Enter amount to withdraw: ");
            amount = sc.nextInt();
            account.withdraw(amount);
        }else if (amount == 3) {
            account.checkBalance();
        }
        System.out.println(AccountBalance);
    }
}
