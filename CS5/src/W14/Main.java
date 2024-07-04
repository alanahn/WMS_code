class Animal {
    String name;
    String color;

    public void bark() {
        System.out.println(name + "가 짖습니다.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        this.name = name;
    }

    public void swim(){
        System.out.println(name+"는 헤엄칩니다!");
    }

    public void bark() {
        System.out.println(name + "는 꼬리를 흔들면서 짖습니다!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("순이");
        dog.bark();
    }
}