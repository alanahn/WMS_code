package FinalExam_Answer;

/**
 * 문제16. 학생의 이름, 나이, 학번의 정보를 저장할 수 있는 Student 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 학생의 정보를 출력하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *
 *        **주의 : 클래스를 꼭 사용해야 합니다.
 *        클래스명 : Student
 *        [필드명]      [접근 제어자]    [정보]
 *        name           private       이름
 *        age            private       나이
 *        studentId      private       학번
 *
 *      [실행 결과]
 *       --출력--
 *        이름: 홍길동, 나이: 20, 학번: 2021001
 */

class Student {
    private String name;
    private int age;
    private int studentId;

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    void printStudent() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 학번: " + studentId);
    }
}

public class Exam16 {
    public static void main(String[] args) {
        Student std = new Student("홍길동", 20, 2021001);

        std.printStudent();
    }
}