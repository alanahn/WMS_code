import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        //b = 랜덤으로 숫자 구하기 (랜덤패키지를 사용함.)
        Random random = new Random();
        int b = random.nextInt(100);

        //반복구문
        while(true) {
            //a = 사용자 입력 받기
            System.out.print("숫자를 입력해주세요. : ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            if(a > b) {
                System.out.println("다운");
            }else if(a < b) {
                System.out.println("업");
            }else {
                System.out.println("정답");
                break;
            }
        }
        System.out.println("게임이 종료되었습니다.");

        // // Scanner 객체 생성
        // Scanner scanner = new Scanner(System.in);

        // while (true) {
        //     int fruit = scanner.nextInt();

        //     switch (fruit) {
        //         case 1:
        //             System.out.println("오렌지");
        //         case 2:
        //             System.out.println("sssss");
        //         case 3:
        //             System.out.println("dddd");
        //         default:
        //             System.out.println("암것도 없음");
        //             break;
        //     }
        // }

        // for(int i = 0; i < 10; i++) {
        //     System.out.println(i);

        //     if (i == 5) {
        //         System.out.println("멈춰!!");
        //         break;
        //     }
        // }

        // while (number < 10) {
        //     number++;
        //     int temp = number;
        //     while (temp < 5) {
        //         System.out.println("지금은 5보다 작아");
        //         temp++;
        //     }

        //     if(number % 2 == 0) {
        //         continue;
        //     }

        //     System.out.println(number);
            
        // }


    }
}
