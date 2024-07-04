package FinalExam_Answer;

/**
 * 문제27. 기기의 이름, 브랜드, 가격의 정보를 저장할 수 있는 Device 클래스를 정의합니다.
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
 *        클래스명: Exam27
 *        [객체배열]    [배열 길이]    [정보]
 *        Device      3            기기의 이름, 브랜드, 가격 저장
 *
 *      [실행 결과]
 *       -------
 *       이름: 맥북
 *       브랜드: 애플
 *       가격: 1500
 *       -------
 *       이름: 아이폰
 *       브랜드: 애플
 *       가격: 1000
 */

public class Exam27 {
    public static void main(String[] args) {
        Device[] devices = new Device[3];
        devices[0] = new Laptop("맥북", "애플", 1500);
        devices[1] = new Smartphone("아이폰", "애플", 1000);
        devices[2] = new Smartphone("갤럭시 S20", "삼성", 900);

        String targetBrand = "애플";
        for (Device device : devices) {
            if (device.getBrand().equals(targetBrand)) {
                device.printInfo();
            }
        }
    }
}

class Device {
    private String name;
    private String brand;
    private int price;

    public Device(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void printInfo() {
        System.out.println("-------");
        System.out.println("이름: " + name);
        System.out.println("브랜드: " + brand);
        System.out.println("가격: " + price);
    }
}

class Laptop extends Device {
    public Laptop(String name, String brand, int price) {
        super(name, brand, price);
    }
}

class Smartphone extends Device {
    public Smartphone(String name, String brand, int price) {
        super(name, brand, price);
    }
}
