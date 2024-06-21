package W13;

public class sample {
    public void method1(){
        int n1=1;
        System.out.println("method1메소드의 지역변수 n1의 값: "+n1);
    }

    public void method2(int n1){
        System.out.println("method2메소드의 매개변수 n1의 값: "+n1);
    }

    public static void main(String[] args) {
        sample lv = new sample();
        lv.method1();
        lv.method2(2);

        int n1=3;
        System.out.println("main메소드의 지역변수 n1의 값: "+n1);
    }
}
