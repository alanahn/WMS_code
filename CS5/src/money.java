import java.util.Arrays;

public class money {
    public static void main(String[] args) {
        // int[] allowanceChart = new int[365];
        // int allowance = 3000;
        int[][] numbers;
        numbers = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // 2차원 배열을 반복하면서 요소 출력
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // 한 행이 끝날 때마다 줄 바꿈
        }

        // for (int i = 1; i < allowanceChart.length; i++) {
        // allowanceChart[i] = allowance;
        // System.out.println(i+"일째 용돈은 "+allowance+"원 입니다.");
        // }
        // allowanceChart[allowanceChart.length-1] = 10000;
        // System.out.println("365일째 용돈은 10000원 입니다.");

        // int sum = 0;
        // for (int _allowance : allowanceChart) {
        // sum += _allowance;
        // }
        // System.out.println(Arrays.toString(allowanceChart));
    }
}
