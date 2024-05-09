package WeSchool;

// Teacher 클래스: 선생님을 나타내는 클래스
// 사람 class 상속
public class Teacher extends Person {
    private String subject;

    // 생성자
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    // // Method
    // public void introduce() {
    // System.out.println(name + " 선생님이 " + subject + " 과목을 가르칩니다.");
    // }

    // @Override
    // public void action() {
    // System.out.println(name + "선생님이 수업을 진행 합니다.");
    // }
}
