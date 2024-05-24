package Mid_Exam.Mid_Exam_CS5_브로디;

import java.util.*;

/**
 * 문제6. 정수 한 개를 입력 받아 다음과 같이 별을 출력하는 프로그램을 만들어 제출하세요. (15점)
 *
 *      [실행 결과1]      [실행 결과2]
 *       --입력--         --입력--
 *        3              4
 *       --출력--         --출력--
 *        *               *
 *        **              **
 *        ***             ***
 *        ***             ****
 *        **              ****
 *        *               ***
 *                        **
 *                        *
 */

public class exam_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=0;i<num;i++) {
            for (int j=0;j<i+1;j++) {
                System.out.print("*");;
            }
            System.out.println();
        }

        for (int i=num;i>0;i--) {
            for (int j=i;j>0;j--) {
                System.out.print("*");;
            }
            System.out.println();
        }
    }
}
