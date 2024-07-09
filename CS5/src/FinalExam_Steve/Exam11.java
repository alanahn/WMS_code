package FinalExam_Steve;


/**
 * [5점]문제11. 정수 한 개를 입력 받아 조건 연산자를 사용해 해당 정수가 양수, 음수, 또는 0인지 확인하는 프로그램을 작성하세요.
 *       사용자로부터 정수를 입력받아, 해당 정수가 양수이면 "양수입니다.", 음수이면 "음수입니다.", 0이면 "0입니다."를 출력하세요.
 *
 *       [실행 결과1]      [실행 결과2]      [실행 결과3]
 *       --입력--         --입력--         --입력--
 *        10             -5              0
 *       --출력--         --출력--         --출력--
 *        양수입니다.      음수입니다.       0입니다.
 */
import java.util.Scanner;

public class Exam11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--입력--");
        int num = sc.nextInt();
        System.out.println("--출력--");
        if (num * -1 < 0) {
            System.out.println("양수입니다.");  
        }
        else if (num * -1 > 0){
            System.out.println("음수입니다.");
        }
        else{
            System.out.println("0입니다.");
        }

    }
}
