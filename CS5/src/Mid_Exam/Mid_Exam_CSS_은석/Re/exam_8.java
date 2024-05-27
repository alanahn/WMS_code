package Mid_Exam.Mid_Exam_CSS_은석.Re;

import java.util.*;

/**
 * 문제8. 5행 5열인 배열의 요소를 세로로 ‘ㄹ’ 형태로 채워 달팽이 모양과 같은 프로그램을 만들어 제출하세요. (20점)
 * 단, 3칸 씩 띄어서 요소를 출력하세요.
 *
 * [실행 결과]
 * (Hint : %3d - 3칸씩 정수 값을 띄움)
 * --출력--
 * 1 10 11 20 21 (9191) 5
 * 2 9 12 19 22 (7373) 10
 * 3 8 13 18 23 (5555) 15
 * 4 7 14 17 24 (3737) 20
 * 5 6 15 16 25 (1919) 35
 */

public class exam_8 {
    public static void main(String[] args) {
        int normal = 9;
        int min_normal = 1;
        int num = 1;

        for (int i = 0; i <= 25; i++) {
            System.out.print(num);
            if (i % 5 == 0) {
                normal -= 2;
                min_normal += 2;
                System.out.println();
            }
            if (i % 2 == 0) {
                num += normal;
            } else if (i % 2 == 1) {
                num += min_normal;
            }

        }
    }

}
