package FinalExam_Eunseok;

/**
 * [15점]문제18. 은행 계좌의 계좌번호, 소유자 이름, 잔액의 정보를 저장할 수 있는 BankAccount 클래스를 정의합니다.
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
 *        클래스명: Exam18
 *        [객체배열]    [배열 길이]    [정보]
 *        BankAccount  2            계좌의 계좌번호, 소유자 이름, 잔액 저장
 *
 *      [실행 결과]
 *       -------
 *       계좌번호: 9460-8081
 *       소유자: 양은석
 *       잔액: 1000000
 *       -------
 *       계좌번호: 8861-2115
 *       소유자: 성현채
 *       잔액: 0
 */

public class Exam18 {
    int left_money = 0;
    public static void main(String[] args) {
        BankAccount[] bankAccount = new BankAccount[3];
    }

}

class BankAccount {
    private String accountNo;
    private String ownerName;
    private String balance;

    public BankAccount(String accountNo, String ownerName, String balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }
}

class SavingAccount extends  BankAccount{
    
}

class CheckingAccount extends  BankAccount{
    
}