package Mid_Exam.Mid_Exam_CS5_브로디;

import java.util.*;

/**
 * 문제3. 정수 한 개를 입력 받아 두 개의 주사위를 던졌을 때 눈의 합이 입력받은 정수가 되는 모든 경우의 수를 출력하는 프로그램을 만들어 제출하세요.(10점)
 *
 *      [실행 결과]
 *       --입력--       --입력--
 *        6             10
 *       --출력--       --출력--
 *        1+5=6         4+6=10
 *        2+4=6         5+5=10
 *        3+3=6         6+4=10
 *        4+2=6
 *        5+1=6
 */

public class exam_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i=1; i<6;i++) {
        for (int j=0;j<6;j++) {
            if (i+j == num) {
                System.out.println(i+"+"+j+"="+num);
            }
        }
    }
    }
}
