package Mid_Exam;

import java.util.*;

/**
 * 문제5. 5개의 정수를 입력 받아 최댓값과 최솟값을 구하는 프로그램을 만들어 제출하세요.(15점)
 *      단, 선택정렬을 구현하여 프로그램을 완성할 것 / 단순 출력을 제외한 반복,조건문을 사용하여 구현한다면 부분점수 부여
 *
 *      [실행 결과]
 *       --입력--
 *        10
 *        20
 *        100
 *        30
 *        60
 *       --출력--
 *        10/20/30/60/100/최댓값은 100, 최솟값은 10입니다.
 */

public class exam_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for (int i=0; i<arr.length; i++) {
        for (int j=0; j<arr.length; j++) {
            arr[i] = sc.nextInt();
            }
        }

        int max = arr[0];
        int min = arr[0];

        for (int i=1; i<arr.length; i++) {
        for (int j=1; j<arr[i].length; j++) {
            if (arr[i] = max) {
                max = arr[i];
            }
            if (arr[i] = min) {
                min = arr[i];
            }
        }
        }
        System.out.print(arr[0]);
        for (int i=1; i<arr.length; i++) {
        for (int j=1; j<arr[i].length; j++) {
            System.out.println("/",arr[i]);
            }
        }
        System.out.println("\n최댓값은 "+max+", 최솟값은 "+min+"입니다. ");
    }
}
