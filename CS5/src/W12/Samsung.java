package W12;

public class Samsung {
    public static void main(String[] args) {
        Galaxy24 phone1 = new Galaxy24("팬텀 화이트");

        System.out.println("Galaxy24의 세로 : " + phone1.height + "mm");
        System.out.println("Galaxy24의 세로 : " + phone1.width + "mm");
        System.out.println("Galaxy24의 세로 : " + phone1.depth + "mm");
        System.out.println("Galaxy24의 세로 : " + phone1.getColor());

        Galaxy24 phone2 = new Galaxy24("그린");
        Galaxy24 phone3 = new Galaxy24("핑크 골드");
        Galaxy24 phone4 = new Galaxy24("팬텀 블랙");

        System.out.println("Galaxy24의 세로 : " + phone2.getColor());
        System.out.println("Galaxy24의 세로 : " + phone3.getColor());
        System.out.println("Galaxy24의 세로 : " + phone4.getColor());


    }
}
