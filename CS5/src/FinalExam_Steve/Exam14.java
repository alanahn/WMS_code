package FinalExam_Steve;

import java.util.Scanner;

/**
 * [5점]문제14. 정수 N을 입력 받아 1부터 N까지의 합을 계산하는 프로그램을 작성하세요.
 *       사용자로부터 정수 N을 입력받아, 1부터 N까지의 합을 출력하세요.
 *
 *       [실행 결과1]      [실행 결과2]
 *       --입력--         --입력--
 *        5               10
 *       --출력--         --출력--
 *        15              55
 */

public class Exam14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--입력--");
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=a; i++){
            sum = sum + i;
        }
        System.out.println("--출력--");
        System.out.println(sum);
    }
}
