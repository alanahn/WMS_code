package com.example;



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
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    if (month < 1 || month > 12) {
        System.out.println("월은 1~12까지 입력 가능합니다.");
    }
    else if (month == 12 || month < 3) {
        System.out.println(month + "월은 겨울입니다.");
    }
    else if (month < 6) {
        System.out.println(month + "월은 봄 입니다.");
    }
    else if (month < 9) {
        System.out.println(month + "월은 여름입니다.");
    }
    else{
        System.out.println(month + "월은 가을입니다.");
    }
    }
    
}
