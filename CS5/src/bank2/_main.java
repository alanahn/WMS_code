package bank;

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
            System.out.println("항목 입력");

            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
