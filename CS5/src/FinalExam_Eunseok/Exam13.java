package FinalExam_Eunseok;

/**
 * [10점]문제13. 고객의 이름, 이메일, 등급, 직업의 정보를 저장할 수 있는 Customer 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 고객의 정보를 출력하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *
 *        **주의 : 클래스를 꼭 사용해야 합니다.
 *        클래스명 : Customer
 *        [필드명]      [접근 제어자]    [정보]
 *        name           private       이름
 *        email          private       이메일
 *        grade          private       등급
 *        job            private       직업
 *
 *      [실행 결과]
 *       --출력--
 *        이름: 양은석, 이메일: Eunseok@example.com, 등급: Gold, 직업: Student
 */

public class Exam13 {
    public static void main(String[] args) {
        Customer customer = new Customer("양은석", "Eunseok@example.com", "Gold", "Student");
        customer.printCustomInfo();
    }
}

class Customer {
    private String name;
    private String email;
    private String grade;
    private String job;

    public Customer(String name, String email, String grade, String job) {
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.job = job;
    }

    public void printCustomInfo() {
        System.out.print("이름: " + this.name + ", ");
        System.out.print("이메일: " + this.email + ", ");
        System.out.print("등급: " + this.grade + ", ");
        System.out.println("직업: " + this.job);
    }
}