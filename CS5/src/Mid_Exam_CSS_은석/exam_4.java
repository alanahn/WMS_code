package Mid_Exam.Mid_Exam_CSS_은석;

import java.util.*;

/**
 * 문제4. 임의의 달을 입력 받아 계절을 확인하는 프로그램을 만들어 제출하세요.(10점)
 *        단, 1~12 이외의 숫자를 입력했을 경우 월은 1~12까지 입력 가능합니다. 출력하세요.
 *
 *        **참고**
 *        3~5월 : 봄
 *        6~8월 : 여름
 *        9~11 : 가을
 *        12~2 : 겨울
 *
 *      [실행 결과1]            [실행 결과2]
 *       --입력--               --입력--
 *        4                     0
 *       --출력--               --출력--
 *        4월은 봄입니다.          월은 1~12까지 입력 가능합니다.
 */

public class exam_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        if (1 <= integer && integer <= 12) {
            if (3 <= integer && integer <= 5) {
                System.out.println("봄");
            }
            else if (6 <= integer && integer <= 8) {
                System.out.println("여름");
            }
            else if (9 <= integer && integer <= 11) {
                System.out.println("가을");
            }
            else {
                System.out.println("겨울");
            }
        }
        else {
            System.out.println("월은 1~12까지 입력 가능합니다.");
        }
        scanner.close();
    }
}
