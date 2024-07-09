package FinalExam_Eunseok;

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
 *       이름: 다니엘
 *       나이: 15
 *       과목:자바를잡아라
 *       -------
 *       이름: 브로디
 *       나이: 14
 *       과목:코뚫린
 *       -------
 *       아름: 스티브
 *       나이: 16
 *       과목:플러터마스터
 */

public class Exam16 {
    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student("다니엘", "15", "자바를잡아라");
        student[1] = new Student("브로디", "14", "코뚫린");
        student[2] = new Student("스티브", "16", "플러터마스터");
        student[0].printInfo();
        student[1].printInfo();
        student[2].printInfo();
    }
}

class Student {
    private String name;
    private String age;
    private String subject;

    public Student(String name, String age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public void printInfo() {
        System.out.println("-------");
        System.out.println("이름: " + this.name);
        System.out.println("나이: " + this.age);
        System.out.println("과목: " + this.subject);
    }
}
