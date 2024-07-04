package FinalExam_Answer;

/**
 * 문제26. 동물의 이름, 나이, 소리의 정보를 저장할 수 있는 Animal 클래스를 정의합니다.
 *        그리고 이를 상속받아 Cat과 Dog 클래스를 작성합니다.
 *        고양이는 "야옹", 개는 "멍멍" 소리를 낼 수 있도록 초기화하고, 해당 소리를 출력하는 메소드를 정의합니다.
 *        동물들을 객체 배열로 만들어 소리를 출력하는 프로그램을 작성하세요.
 *
 *        클래스명 : Animal
 *        [필드명]    [접근 제어자]    [정보]
 *        name       private         이름
 *        age        private         나이
 *        sound      private         소리
 *
 *        클래스명 : Cat (Animal 상속)
 *        클래스명 : Dog (Animal 상속)
 *        
 *        클래스명: Exam26
 *        [객체배열]    [배열 길이]    [정보]
 *        Animal      3            동물의 이름, 나이, 소리 저장
 *
 *      [실행 결과]
 *       -------
 *       이름: 나비
 *       나이: 3
 *       소리: 야옹
 *       -------
 *       이름: 뽀삐
 *       나이: 2
 *       소리: 멍멍
 *       -------
 *       이름: 두부
 *       나이: 1
 *       소리: 야옹
 */

public class Exam26 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("나비", 3);
        animals[1] = new Dog("뽀삐", 2);
        animals[2] = new Cat("두부", 1);

        for (Animal animal : animals) {
            animal.printInfo();
        }
    }
}

class Animal {
    private String name;
    private int age;
    private String sound;

    public Animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void printInfo() {
        System.out.println("-------");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("소리: " + sound);
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age, "야옹");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age, "멍멍");
    }
}
