package FinalExam_Brody;
import java.util.*;
/**
 * [10점]문제17. 밑변과 높이 정보를 저장할 수 있는 Rectangle 클래스를 정의합니다.
 *        클래스는 밑변과 높이의 정보를 변경시킬 수 있는 메소드와 사각형의 넓이를 계산해서 반환하는 메소드도 함께 정의합니다.
 *        아래 실행 결과와 같이 밑변과 높이를 입력받고 객체를 생성하여 생성자로 초기화 후 사각형의 넓이를 출력합니다.
 *        그리고 두번째 입력을 받아 밑변과 높이의 정보를 변경시키는 메소드를 사용해 밑변과 높이를 변경시키고
 *        사각형의 넓이를 출력합니다.
 *
 *        클래스명 : Rectangle
 *        [필드명]      [접근 제어자]    [정보]
 *        bottom        private        밑변
 *        height        private        높이
 *
 *      [실행 결과]
 *       --입력--
 *        30.0 10.2 
 *       --출력--
 *        사각형의 넓이: 309.05
 *       --입력--
 *        10.0 20.3 
 *       --출력--
 *        사각형의 넓이: 203.0
 */
class Rectangle {
    private double bottom;
    private double height;

    public Rectangle(double bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }    
    String he() {
        return "사각형의 넓이: "+bottom*height;
    }
}

public class Exam17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.println(rectangle.he());
        rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.println(rectangle.he());
    }
}
