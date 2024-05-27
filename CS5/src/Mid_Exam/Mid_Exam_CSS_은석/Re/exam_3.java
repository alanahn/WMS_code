package Mid_Exam.Mid_Exam_CSS_은석.Re;

import java.util.*;

/**
 * 문제3. 정수 한 개를 입력 받아 두 개의 주사위를 던졌을 때 눈의 합이 입력받은 정수가 되는 모든 경우의 수를 출력하는 프로그램을 만들어
 * 제출하세요.(10점)
 *
 * [실행 결과]
 * --입력-- --입력--
 * 6 10
 * --출력-- --출력--
 * 1+5=6 4+6=10
 * 2+4=6 5+5=10
 * 3+3=6 6+4=10
 * 4+2=6
 * 5+1=6
 */

public class exam_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        for (int i = 1; i <= 6; i++) {
            for (int e = 6; e > 0; e--) {
                if (i + e == integer) {
                    System.out.printf("%d+%d=%d\n", i, e, integer);
                }
            }
        }
        scanner.close();
    }
}
