package W05;
import java.util.*;

public class W05 {
    public static void main(String[] args) {
        int [][] score = {
            {10, 20, 30},
            {20, 20, 20},
            {30, 30, 30},
            {40, 40, 40}
        };

        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                // 2차원 배열 출력
                // System.out.printf("score[%d][%d]=%d",i, j, score[i][j]);
                // 형식 맞춰 출력
                System.out.printf("%4d", score[i][j]);
            }
            System.out.println();
        }

        int [][] numbers = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };

        for(int i = numbers.length-1; i >= 0; i--) {
            for(int j = numbers[i].length-1; j >=0; j--) {
                System.out.printf("%4d", numbers[i][j]);
            }
            System.out.println();
        }

        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }

        System.out.println("합 : " + sum);

        String [][] name = {
            {"은석", "다니엘", "스티브", "브로디"},
            {"제이슨", "카이", "맥스", "다림"}
        };

        System.out.println(Arrays.deepToString(name));

        Scanner sc = new Scanner(System.in);
        System.out.println("Row : ");
        int row = sc.nextInt();
        System.out.println("Col : ");
        int col = sc.nextInt();

        //행 길이 입력
        //열 길이 입력

        //배열을 생성
        int [][] nums = new int[row][col];

        //생성한 배열에 배열의 요소를 입력
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                System.out.println("input : ");
                nums[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
            System.out.println();
        }


        for (int[] num:nums) {
            for (int n : num) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        //입력이 끝나면 배열 출력

    }
}