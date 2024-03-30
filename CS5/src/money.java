import java.util.Arrays;

public class money {
    public static void main(String[] args) {
        int[] allowanceChart = new int[365];
        int allowance = 3000;
        
        for (int i = 1; i < allowanceChart.length; i++) {
            allowanceChart[i] = allowance;
            System.out.println(i+"일째 용돈은 "+allowance+"원 입니다.");
        }
        allowanceChart[allowanceChart.length-1] = 10000;
        System.out.println("365일째 용돈은 10000원 입니다.");

        int sum = 0;
        for (int _allowance : allowanceChart) {
            sum += _allowance;
        }
        System.out.println(Arrays.toString(allowanceChart));
    }
}
