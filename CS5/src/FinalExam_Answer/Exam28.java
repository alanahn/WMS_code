package FinalExam_Answer;

/**
 * 문제28. 은행 계좌의 계좌번호, 소유자 이름, 잔액의 정보를 저장할 수 있는 BankAccount 클래스를 정의합니다.
 *        그리고 이를 상속받아 SavingAccount와 CheckingAccount 클래스를 작성합니다.
 *        각 계좌는 입금과 출금을 할 수 있으며, 출금 시 잔액이 부족하면 오류 메시지를 출력합니다.
 *        계좌 정보를 출력하는 프로그램을 작성하세요.
 *
 *        클래스명 : BankAccount
 *        [필드명]     [접근 제어자]    [정보]
 *        accountNo   private         계좌번호
 *        ownerName   private         소유자 이름
 *        balance     private         잔액
 *
 *        클래스명 : SavingAccount (BankAccount 상속)
 *        클래스명 : CheckingAccount (BankAccount 상속)
 *        
 *        클래스명: Exam28
 *        [객체배열]    [배열 길이]    [정보]
 *        BankAccount  2            계좌의 계좌번호, 소유자 이름, 잔액 저장
 *
 *      [실행 결과]
 *       -------
 *       계좌번호: 123-456
 *       소유자: 홍길동
 *       잔액: 5000
 *       -------
 *       계좌번호: 789-012
 *       소유자: 김영희
 *       잔액: 10000
 */

public class Exam28 {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingAccount("123-456", "홍길동", 5000);
        accounts[1] = new CheckingAccount("789-012", "김영희", 10000);

        for (BankAccount account : accounts) {
            account.printInfo();
        }
    }
}

class BankAccount {
    private String accountNo;
    private String ownerName;
    private int balance;

    public BankAccount(String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public void printInfo() {
        System.out.println("-------");
        System.out.println("계좌번호: " + accountNo);
        System.out.println("소유자: " + ownerName);
        System.out.println("잔액: " + balance);
    }
}

class SavingAccount extends BankAccount {
    public SavingAccount(String accountNo, String ownerName, int balance) {
        super(accountNo, ownerName, balance);
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNo, String ownerName, int balance) {
        super(accountNo, ownerName, balance);
    }
}
