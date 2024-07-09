package FinalExam_Eunseok;
import java.util.Scanner;;

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
        System.out.println("--입력--");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int number_sum = 0;
        for (int i = 0; num > i; i++) {
            number_sum += num - i;
        }
        System.out.println("--출력--");
        System.out.println(number_sum);
        scanner.close();
    }
}
