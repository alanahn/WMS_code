package Mid_Exam.Mid_Exam_CSS_은석;

import java.util.*;

/**
 * 문제1. 두 정수를 입력 받아 두 수의 합, 차, 평균을 구하는 프로그램을 만들어 제출하세요. (5점)
 *
 *      [실행 결과1]      [실행 결과2]
 *       --입력--         --입력--
 *        3               10
 *        5               20
 *       --출력--         --출력--
 *        합: 8           합: 30
  *       차: -2          차: -10
 *        평균: 4         평균: 15
 */

public class exam_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        int integer0 = scanner.nextInt();
        System.out.printf("합: %d", integer + integer0);
        System.out.println();
        System.out.printf("차: %d", integer - integer0);
        System.out.println();
        System.out.printf("평균: %d", (integer + integer0) / 2);
        scanner.close();
    }
}
