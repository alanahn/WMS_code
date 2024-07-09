package FinalExam_Brody;

/**
 * [15점]문제18. 기기의 이름, 브랜드, 가격의 정보를 저장할 수 있는 Device 클래스를 정의합니다.
 *        그리고 이를 상속받아 Laptop과 Smartphone 클래스를 작성합니다.
 *        Device 객체 배열의 길이는 3이며, 브랜드가 특정 브랜드인 기기의 정보를 출력하는 프로그램을 작성하세요.
 *
 *        클래스명 : Device
 *        [필드명]    [접근 제어자]    [정보]
 *        name       private         이름
 *        brand      private         브랜드
 *        price      private         가격
 *
 *        클래스명 : Laptop (Device 상속)
 *        클래스명 : Smartphone (Device 상속)
 *        
 *        클래스명: Exam18
 *        [객체배열]    [배열 길이]    [정보]
 *        Device      3            기기의 이름, 브랜드, 가격 저장
 *
 *      [실행 결과]
 *       -------
 *       이름: 맥북
 *       브랜드: 애플
 *       가격: 250만원
 *       -------
 *       이름: 아이폰
 *       브랜드: 애플
 *       가격: 200만원
 */
class Device {
    private String name;
    private String brand;
    private String price;

    public Device(String name, String brand, String price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
}

class Laptop extends Device {

    public Laptop(String name, String brand, String price) {
        super(name, brand, price);
    }
}

class Smartphone extends Device {

    public Smartphone(String name, String brand, String price) {
        super(name, brand, price);
    }
}

public class Exam18 {
    public static void main(String[] args) {
        
    }
}
