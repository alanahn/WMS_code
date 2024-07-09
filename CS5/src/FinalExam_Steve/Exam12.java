package FinalExam_Steve;

/**
 * [10점]문제12. 고객의 이름, 이메일, 등급, 나이의 정보를 저장할 수 있는 Customer 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 고객의 정보를 출력하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *
 *        **주의 : 클래스를 꼭 사용해야 합니다.
 *        클래스명 : Customer
 *        [필드명]      [접근 제어자]    [정보]
 *        name           private       이름
 *        email          private       이메일
 *        grade          private       등급
 *        age            private       나이
 *
 *      [실행 결과]
 *       --출력--
 *        이름: 스티브, 이메일: steve@example.com, 등급: Gold, 나이: 15
 */

public class Exam12 {
public static void main(String[] args) {
    Customer customer = new Customer("스티브", "steve@example.com" ,  "gold", "15");
    customer.infoprint();
}
}
class Customer{
    private String name;
    private String email;
    private String grade;
    private String age;
    public Customer(String name, String email, String grade, String age) {
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.age = age;
    }
    public void infoprint(){
        System.out.println("이름: " + name + ", 이메일: " + email + ", 등급: " + grade + ", 나이: " + age);
    }

}
