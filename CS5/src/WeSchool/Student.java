package WeSchool;

// Student 클래스: 학생을 나타내는 클래스
public class Student extends Person {
    private String name;
    private int grade;

    // 생성자
    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    // Method
    public void introduce() {
        System.out.println("저의 이름은 " + name + "입니다.");
    }

    @Override
    public void action() {
        System.out.println(name + "학생이 수업을 듣습니다.");
    }
}