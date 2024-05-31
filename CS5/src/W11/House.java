package W11;



/**
 * House
 */
public class House {
    public static void main(String[] args) {
        HousePrint house = new HousePrint(100, 200);
        System.out.println("집은 "+house.getWidth()+ "/"+ house.getHeight()+"입니다.");

        house.setWidth(50);
        house.setHeight(70);
        house.setColor("Blue");

        int width = house.getWidth();
        int height = house.getHeight();


        System.out.println("집의 너비는 "+width+", 높이는 "+height+"입니다.");
        System.out.println("집은 "+house.size(width,height)+"평입니다.");
        house.build();
        System.out.println("집의 색은 "+house.getColor()+"입니다.");
        house.paint();

    }
}