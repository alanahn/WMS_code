package FinalExam_Brody;

/**
 * [10점]문제16. 차의 모델명, 년도, 색, 주행거리의 정보를 저장할 수 있는 Car 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 차의 정보를 출력하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *
 *        **주의 : 클래스를 꼭 사용해야 합니다.
 *        클래스명 : Car
 *        [필드명]      [접근 제어자]    [정보]
 *        modelName      private      모델명
 *        modelYear      private       년도
 *        color          private        색
 *        distance       private        주행거리
 *
 *      [실행 결과]
 *       --출력--
 *        2024년식 검정색 스포티지 1000km
 */
class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private String distance;

    public Car(String modelName, int modelYear, String color, String distance) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.distance = distance;
    }

    String hi() {
        return modelYear+"년식 "+color+"색 "+modelName+" "+distance;
    }
}
public class Exam16 {
    public static void main(String[] args) {
        Car car = new Car("스포티지", 2024, "검정", "1000km");
        System.out.println(car.hi());
    }
}
