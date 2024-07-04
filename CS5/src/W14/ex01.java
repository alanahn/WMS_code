package W14;

public class ex01 {

    class a {
        public int b(int a, int b) {
            return a+b;
        }

        public float b(float a, float b) {
            System.out.println("나는 야~" + a);
        }
    }

    
    public static void main(String[] args) {
        a b = new a();
        b.b();
        b.b(1);
    }
}
