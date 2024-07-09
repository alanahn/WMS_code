package FinalExam_Eunseok;

/**
 * [10점]문제15. 차의 모델명, 년도, 색의 정보를 저장할 수 있는 Car 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 차의 정보를 출력하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *
 *        **주의 : 클래스를 꼭 사용해야 합니다.
 *        클래스명 : Car
 *        [필드명]      [접근 제어자]    [정보]
 *        modelName      private      모델명
 *        modelYear      private       년도
 *        color          private        색
 *
 *      [실행 결과]
 *       --출력--
 *        2024년식 흰색 아반떼
 */

public class Exam15 {
    public static void main(String[] args) {
        Car car = new Car("아반때", "2024", "흰색");
        car.PrintInfo();
    }
}

class Car {
    private String modelName;
    private String modelYear;
    private String color;

    public Car(String modelName, String modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    public void PrintInfo() {
        System.out.println(this.modelYear + "년식 " + color + " " + this.modelName);
    }
}