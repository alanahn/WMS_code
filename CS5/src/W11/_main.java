package W11;

import java.util.Scanner;

public class _main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        // sc.nextInt();
        // System.out.println(p1.name);
        // p1.introduce();
        // p1.name = "JoY";
        // p1.introduce();
        // sc.close();

        p1.setName("alan");
        p1.setAge(14);
        p1.setHeight(180);
        p1.setAddress("운중동");

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getHeight());
        System.out.println(p1.getAddress());
        // p1.age = 14;
        // p1.height = 178.5;

        // System.out.println("안녕? 나는 " + p1.name + "입니다.");
        // System.out.println("나이는 " + p1.age + "입니다.");
        // System.out.println("신장는 " + p1.height + "입니다.");

        p1.walk();
        p1.run();

        Students[] students = new Students[3];

        for(int i=0; i<students.length; i++) {
            students[i] = new Students();
        }

        students[0].setName("스티브");
        students[0].setNum(1);
        students[0].setGrade("A");
        students[0].setRemark("잘함1");

        students[1].setName("브로디");
        students[1].setNum(2);
        students[1].setGrade("A");
        students[1].setRemark("잘함2");

        students[2].setName("다니엘");
        students[2].setNum(3);
        students[2].setGrade("A");
        students[2].setRemark("잘함3");

        for(Students i : students) {
            System.out.println("-----");
            System.out.println("이름:"+i.getName());
            System.out.println("번호:"+i.getNum());
            System.out.println("성적:"+i.getGrade());
            System.out.println("특기사항:"+i.getRemark());
        }
    }
}
