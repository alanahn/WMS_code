package FinalExam_Daniel;

/**
 * [10점]문제16. 학생의 이름, 나이,듣는 과목의 정보를 저장할 수 있는 Student 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 객체 배열의 길이는 3이며 학생의 과목 정보를 변경시킬 수 있는 메소드와
 *        학생 정보를 출력하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *
 *        클래스명 : Student
 *        [필드명]      [접근 제어자]    [정보]
 *        name         private         이름
 *        age          private         나이
 *        subject      private         과목명
 *
 *
 *        클래스명: Exam16
 *        [객체배열]    [배열 길이]    [정보]
 *        Student      3            학생의 이름, 나이, 과목 저장
 *
 *      [실행 결과]
 *       -------
 *       이름: 은석
 *       나이: 15
 *       과목:자바를잡아라
 *       -------
 *       이름: 브로디
 *       나이: 14
 *       과목:코틀린뚫어라
 *       -------
 *       아름: 스티브
 *       나이: 16
 *       과목:자바스쿠립트
 */

class Student3 {
    private String name;
    private int age;
    private String subject;

    public Student3(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    String printStudent3() {
        return "이름" + name + "\n나이:" + age + "\n과목:" + subject;
    }
    
}

public class Exam16 {

    public static void main(String[] args) {
        Student3[] students = new Student3[3];

        students[0] = new Student3("은석", 15, "자바를잡아라");
        students[1] = new Student3("브로디", 14, "코틀린뚫어라");
        students[2] = new Student3("스티브", 16, "자바스쿠립트");

        
        for (Student3 student3 : students) {
            System.out.println("-------");
            System.out.println(student3.printStudent3());
        } 
    }
}