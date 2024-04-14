package W06;
import java.lang.reflect.Array;
import java.util.*;

public class W06_test {
    public static void main(String[] args) {
        //정수 한 개를 입력받아 학점을 판별하는 프로그램
        // 90이상 A
        // 80이상 90 미만 비
        // 70이상 80 미만 씨
        // 60이상 70 미만 디
        // 60 미만 에프

        // 실행결과
        // 입력 : 80 / 출력 비학점
        // 입력 : 53 / 출력 에프학점

        // Scanner sc = new Scanner(System.in);
        // int score = sc.nextInt();
        // if(score>=90) {
        //     System.out.println("A");
        // } else if (score>=80) {
        //     System.out.println("B");
        // }

        // 정수 한 개 입력 받아, 아래와 같이 별을 출력하는 프로그램을 만들어주세요.

        // 입력 : 3
        // 출력 
        /* 
         *  *
         *  **
         *  ***
         *  ***
         *  **
         *  *
         */

         // 입력 : 4
        // 출력 
        /* 
         *  *
         *  **
         *  ***
         *  ****
         *  ****
         *  ***
         *  **
         *  *
         */

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // for (int i=0; i < num; i++) {
        //     for (int j=0; j < i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int i=num; i > 0; i--) {
        //     for (int j=i; j > 0; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // sc.close();

        // 정수 1부터 20까지 순서대로 공백을 한 칸 두고 수를 출력하는데,
        // 3 또는 6 또는 9가 포함된 수일 경우 "짝!"을 출력하는 369 프로그램을 만들어 주세요.

        // 실행
        // 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝 20

        // for (int i = 1; i < 21; i++) {
        //     if(i %10 == 3 || i% 10 == 6 || i % 10 == 9) {
        //         System.out.print("짝 ");
        //     } else {
        //         System.out.print(i + " ");
        //     }
        // }
        
        // 금액을 입력 받은 후 각각 몇 개의 동전(500, 100, 50, 10을 저장한 배열 초기화)이 필요한지
        // 계산해 가능한 적은 수의 동전으로 거슬러 주는 프로그램을 만들어보자~~

        // 입력 
        // 3000
        // 금액=3000
        // 500원:6
        // 100원:0
        // 50원:0
        // 10원:0

        // 입력 
        // 2650
        // 금액=2650
        // 500원:5
        // 100원:1
        // 50원:1
        // 10원:0

        // int[] coins = {500, 100, 50, 10};

        // Scanner sc = new Scanner(System.in);
        // int money = sc.nextInt();

        // System.out.println("금액="+money);

        // for(int i=0; i<coins.length;i++) {
        //     System.out.println(coins[i]+"won : "+money/coins[i]);
        //     money %= coins[i];
        // }

        //정수 6개 입력
        //최대, 최소값 구하기

        // Scanner sc = new Scanner(System.in);
        // int[] numbers = new int[6];

        // for(int i=0;i<numbers.length;i++) {
        //     numbers[i] = sc.nextInt();
        // }

        // int max = numbers[0];
        // int min = numbers[0];

        // for(int i=0; i<numbers.length; i++){
        //     if(numbers[i] > max) {
        //         max=numbers[i];
        //     }else if(numbers[i] < min) {
        //         min=numbers[i];
        //     }
        // }
        // System.out.println(max);
        // System.out.println(min);

        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));

        // System.out.println(numbers[numbers.length-1]);
        // System.out.println(numbers[0]);

        // O O X O X O O O X O 와 같은 OX퀴즈의 결과가 있습니다.
        // 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
        // 예) 1+2+0+1+0+1+2+3+0+1 = 11
        // 채점하는 프로그램을 만들자~!

        // Scanner sc = new Scanner(System.in);
        // String[] arr = new String[10];

        // int cnt=0;
        // int sum=0;

        // for(int i = 0; i<arr.length;i++) {
        //     arr[i] = sc.next();
        // }

        // for(int i=0;i<arr.length;i++) {
        //     if(arr[i].equals("O")) {
        //         cnt++;
        //     }else{
        //         cnt = 0;
        //     }
        //     sum += cnt;
        // }
        // System.out.println(sum);

        //5 X 5 배열 요소를 세로로 'ㄹ' 형태로 채워 달팽이 모양과 같은 프로그램을 만들자~~
        //단, 3칸 씩 띄어서 출력

        // 5 6 15 16 25
        // 4 7 14 17 24
        // 3 8 13 18 24
        // 2 9 12 19 22
        // 1 10 11 20 21

        int[][] arr = new int[5][5];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j< arr[i].length; j++) {
                if(j % 2 == 0) {
                    arr[i][j] = 5 * (j + 1) - i;
                }else {
                    arr[i][j] = (i + 1) + 5 * j;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
