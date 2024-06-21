package W14;

class Parent{
    int num;
    Parent(int n)
    {
        num=n;
    }
}

class Child extends Parent{
    int num2;
    Child(){
        super(1);
        num2=2;
    }

    void display(){
        System.out.println("Parent: "+num);
        System.out.println("Child: "+num2);
    }
}


public class Super01 {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.display();
    }
}
