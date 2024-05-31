package W11;

public class Person {
    private String name;
    private int age;
    private double height;
    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void introduce() {
        System.out.println("안녕? 나는 " + name + "입니다.");
    }

    void walk() {
        System.out.println("걷습니다.");
    }

    void run() {
        System.out.println("달려!");
    }
}
