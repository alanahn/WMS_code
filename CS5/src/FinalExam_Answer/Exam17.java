package FinalExam_Answer;

import java.util.Scanner;

/**
 * 문제17. 정수 한 개를 입력 받아 조건 연산자를 사용해 해당 정수가 짝수인지 홀수인지 확인하는 프로그램을 작성하세요.
 *       사용자로부터 정수를 입력받아, 해당 정수가 짝수이면 "짝수", 홀수이면 "홀수"를 출력하세요.
 *
 *       [실행 결과1]      [실행 결과2]
 *       --입력--         --입력--
 *        19              20
 *       --출력--         --출력--
 *        홀수              짝수
 */

public class Exam17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--입력--");
        int number = scanner.nextInt();

        System.out.println("--출력--");
        String result = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);

        scanner.close();
    }

}
