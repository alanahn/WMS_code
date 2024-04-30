package Mid_Exam.Mid_exam_CS5_스티브;

import java.util.*;

/**
 * 문제8. 5행 5열인 배열의 요소를 세로로 ‘ㄹ’ 형태로 채워 달팽이 모양과 같은 프로그램을 만들어 제출하세요. (20점)
 *        단, 3칸 씩 띄어서 요소를 출력하세요.
 *
 *      [실행 결과]
 *      (Hint : %3d -  3칸씩 정수 값을 띄움)
 *       --출력--
 *           1 10 11 20 21
 *           2  9 12 19 22
 *           3  8 13 18 23
 *           4  7 14 17 24
 *           5  6 15 16 25
 */

public class exam_8 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if (j % 2 == 0) {
                    arr[i][j] = (i + 1) + 5 * j;
                }
                else{
                    arr[i][j] = 5 * (j + 1) - i;
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.printf("%3d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
