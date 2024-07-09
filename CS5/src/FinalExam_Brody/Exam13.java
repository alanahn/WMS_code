package FinalExam_Brody;

/**
 * [10점]문제13. 고객의 이름, 이메일, 등급의 정보를 저장할 수 있는 Customer 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 고객의 정보를 출력하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *
 *        **주의 : 클래스를 꼭 사용해야 합니다.
 *        클래스명 : Customer
 *        [필드명]      [접근 제어자]    [정보]
 *        name           private       이름
 *        email          private       이메일
 *        grade          private       등급
 *
 *      [실행 결과]
 *       --출력--
 *        이름: 브로디, 이메일: Brody@example.com, 등급: Gold
 */
class Customer {
    private String name;
    private String email;
    private String grade;

    public Customer(String name, String email, String grade) {
        this.name = name;
        this.email = email;
        this.grade = grade;
    }

    String cst() {
        return "이름: "+ name + ", 이메일: " + email+", 등급: "+grade;
    }
}

public class Exam13 {
    public static void main(String[] args) {
        Customer customer = new Customer("브로디", "example@gmail.com", "Gold");
        System.out.println(customer.cst());
    }
}
