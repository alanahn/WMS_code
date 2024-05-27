package bank2;

/**
 * Account
 */
public class Account {

    private String accountNumber;
    private String name;
    private String pwd;
    private int balance;

    public Account() {}

    public Account(String accountNumber, String name, String pwd, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.pwd = pwd;
        this.balance = balance;
    }

    public void printAccount() {
        System.out.printf("계좌번호 : %s, 이름 : %s, 잔고 : %d%n", accountNumber, name, balance);
    }

    public String getAccNum() {
        return this.accountNumber;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public int getBalance() {
        return this.balance;
    }
}