package WeSchool;

public class WMS {
    public static void main(String[] args) {
        // 학교 생성
        School school = new School("WayMakerSchool", "경기도 판교");

        // 선생님 생성
        Teacher teacher1 = new Teacher("존코치", "수학");

        // 학생 생성
        Student student1 = new Student("홍길동", 3);

        // 학교 공지 발표
        school.announce("오늘은 체육대회가 있습니다.");

        // 선생님 1 안내
        teacher1.introduce();

        // 학생 1
        student1.introduce();
    }
}
