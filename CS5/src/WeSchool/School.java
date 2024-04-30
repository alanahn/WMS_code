package WeSchool;

//학교를 나타내는 클래스
public class School {
    // School 클래스에 캡슐화를 적용하여 멤버 변수에 직접 접근하지 않고 메서드를 통해 접근하도록 함
    private String name;
    private String location;

    // 생성자
    public School(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    // Method
    public void announce(String message) {
        System.out.println("[" + name + "] " + message);
    }
}