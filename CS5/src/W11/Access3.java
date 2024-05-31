package W11;

public class Access3 {
    private void messageInside() {
        System.out.println("Access2: private");
    }

    void messageDefault() {
        System.out.println("Access2: default");
    }

    protected void messageProtected() {
        System.out.println("Access2: protected");
    }

    public void messageOutside() {
        System.out.println("Access2: public");
        messageInside();
    }
}
