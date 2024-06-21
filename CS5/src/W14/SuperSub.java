package W14;

class A {
    String aField = "클래스 A 필드";

    public void aMethod() {
        System.out.println(aField);
    }
}

class B extends A {
    String bField = "클래스 B 필드";

    public void bMethod() {
        System.out.println(aField);
        System.out.println(bField);
    }
}

class C extends B {
    String cField = "클래스 C 필드";

    public void cMethod() {
        System.out.println(aField);
        System.out.println(bField);
        System.out.println(cField);
    }
}

public class SuperSub {
    public static void main(String[] args) {
        System.out.println("----A----");
        A a = new A();
        a.aMethod();

        System.out.println("----B----");
        B b = new B();
        b.aField = "hello";
        b.bField = "hello";
        b.aMethod();
        b.bMethod();

        System.out.println("----C----");
        C c = new C();
        c.aMethod();
        c.bMethod();
        c.cMethod();
    }
}
