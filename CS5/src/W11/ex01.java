package W11;

class AccessModifier{
    private void messageInside() {
            System.out.println("private");
    }

    void messageDefault() {
            System.out.println("default");
    }

    protected void messageProtected() {
            System.out.println("protected");
    }

    public void messageOutside() {
            System.out.println("public");
            messageInside();
    }
}

public class ex01 {
    public static void main(String[] args){
        AccessModifier accessModifier = new AccessModifier();

        // accessModifier.messageInside();
        accessModifier.messageDefault();
        accessModifier.messageProtected();
        accessModifier.messageOutside();

        Access2 access2 = new Access2();
        access2.messageDefault();
        access2.messageProtected();
        access2.messageOutside();
}
}
