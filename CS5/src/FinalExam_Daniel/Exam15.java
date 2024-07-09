package FinalExam_Daniel;

/**
 * [10점]문제15. 밑변과 높이 정보를 저장할 수 있는 Rectangle 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 끝으로 밑변과 높이의 정보를 변경시킬 수 있는 메소드와
 *        사각형의 넓이를 계산해서 반환하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *        단, 두번째 출력문은 밑변과 높이의 정보를 변경시키는 메소드를 사용해 출력합니다.
 *
 *        클래스명 : Rectangle
 *        [필드명]      [접근 제어자]    [정보]
 *        bottom        private        밑변
 *        height        private        높이
 *
 *      [실행 결과]
 *       --출력--
 *        사각형의 넓이: 309.05
 *        사각형의 넓이: 203.0
 */

class Rectangle {
    private double bottom;
    private double height;
    public String getArea;

    Rectangle(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return bottom * height;
    }
}


public class Exam15 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle (30, 10.2);
        System.out.println(rectangle.getArea());

        rectangle.setBottom(30);
        rectangle.setHeight(20.3);
        System.out.println(rectangle.getArea());
    }
}


