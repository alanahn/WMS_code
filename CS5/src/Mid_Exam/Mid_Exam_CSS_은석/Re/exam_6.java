package Mid_Exam.Mid_Exam_CSS_은석.Re;

import java.util.*;

/**
 * 문제6. 정수 한 개를 입력 받아 다음과 같이 별을 출력하는 프로그램을 만들어 제출하세요. (15점)
 *
 * [실행 결과1] [실행 결과2]
 * --입력-- --입력--
 * 3 4
 * --출력-- --출력--
 * * *
 * ** **
 * *** ***
 * *** ****
 * ** ****
 * * ***
 * **
 * *
 */

public class exam_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        for (int i = 0; i < integer; i++) {
            for (int e = 0; e < i + 1; e++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = integer; i > 0; i--) {
            for (int e = i; e > 0; e--) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
