package Day2;

public class ConstructorAccount
{
    int accountNumber;
    int balance;
    public ConstructorAccount(){
        this.accountNumber = 123;
        this.balance = 1000;
    }
    public ConstructorAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public ConstructorAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 1000;
    }

    public static void main(String[] args) {
        ConstructorAccount acc = new ConstructorAccount(345,4566);
        ConstructorAccount acc1 = new ConstructorAccount(876);
        System.out.println("Account Number: "+acc.accountNumber + " Balance: "+acc.balance);
        System.out.println("AccountNumber :"+acc1.accountNumber);
        ConstructorAccount acc2 = new ConstructorAccount();
        System.out.println("Account Number: "+acc2.accountNumber + " Balance: "+acc2.balance);
    }
}
