package Mid_Exam.Mid_Exam_CS5_다니엘.Re;

import java.util.*;

/**
 * 문제2. 정수 한 개를 입력 받아 홀수인지 짝수인지 확인하는 프로그램을 만들어 제출하세요.(10점)
 * 단, 한 개의 정수는 1부터 100 사이의 숫자만 입력할 수 있으며 이외 숫자를 입력하면 "정해진 숫자범위를 벗어났습니다."를 출력하고
 * 프로그램이 종료됩니다.
 *
 * [실행 결과1] [실행 결과2] [실행 결과3]
 * --입력-- --입력-- --입력--
 * 8 5 101
 * --출력-- --출력-- --출력--
 * 짝수입니다. 홀수입니다. 정해진 숫자범위를 벗어났습니다.
 */

public class exam_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 101 && num > 0) {
            if (num % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        }
    }
}
