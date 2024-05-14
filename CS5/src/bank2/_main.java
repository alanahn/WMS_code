package bank2;

import java.util.Scanner;

public class _main {
    static Account[] accounts = new Account[100];
    static int index = 0;

    public static void main(String[] args) {
        boolean isExit = false;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 계좌계설");
            System.out.println("2. 입금");
            System.out.println("3. 출금");
            System.out.println("4. 잔액조회");
            System.out.println("5. 전체계좌조회");
            System.out.println("6. 종료");
            System.out.print("항목 입력 : ");

            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    credit();
                    break;
                case 3:
                    devit();
                    break;
                case 4:
                    retrieveBalance();
                    break;
                case 5:
                    retrieveAccount();
                    break;
                case 6:
                    isExit = true;
                    break;
            }
        } while (!isExit);
    }

    private static void retrieveBalance() {
        Scanner sc = new Scanner(System.in);

        System.out.println("계좌번호 : ");
        String accNum = sc.nextLine();

        Account account = fABA(accNum);
        if(account == null) {
            System.out.println("계좌번호를 정확하게 입력해주세요.");
            return;
        }

        System.out.printf("잔액 : %,d\n", account.getBalance());
    }

    private static void devit() {
        Scanner scan = new Scanner(System.in);

        System.out.println("계좌번호 : ");
        String accNum = scan.nextLine();

        Account account = fABA(accNum);
        if(account == null) {
            System.out.println("계좌번호를 정확하게 입력해주세요.");
            return;
        }

        System.out.println("금액 : ");
        int amount = Integer.parseInt(scan.nextLine());

        account.withdraw(amount);
        System.out.println("출금이 완료되었습니다.");

    }

    private static void credit() {
        Scanner scan = new Scanner(System.in);

        System.out.println("계좌번호 : ");
        String accNum = scan.nextLine();

        Account account = fABA(accNum);
        if(account == null) {
            System.out.println("계좌번호를 정확하게 입력해주세요.");
            return;
        }

        System.out.println("금액 : ");
        int amount = Integer.parseInt(scan.nextLine());
        
        account.deposit(amount);
        System.out.println("입금이 완료되었습니다. 아리가또 고자이마스");

    }

    private static Account fABA(String accNum) {
        for(int i=0; i < index; i++) {
            if(accounts[i].getAccNum().equals(accNum)) {
                return accounts[i];
            }
        }
        return null;
    }

    private static void retrieveAccount() {
        for(int i = 0; i < index; i++) {
            accounts[i].printAccount();
        }
    }

    private static void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호 : ");
        String accountNumber = sc.nextLine();

        System.out.println("이름 : ");
        String name = sc.nextLine();

        System.out.println("비밀번호 : ");
        String pwd = sc.nextLine();

        System.out.println("잔고 : ");
        int balance = Integer.parseInt(sc.nextLine());

        Account account = new Account(accountNumber, name, pwd, balance);
        accounts[index++] = account;

    }
}
