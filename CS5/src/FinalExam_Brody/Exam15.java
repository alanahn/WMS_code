package FinalExam_Brody;

/**
 * [10점]문제15. 가게의 이름, 위치, 평점의 정보를 저장할 수 있는 Store 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 가게의 정보를 출력하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *
 *        **주의 : 클래스를 꼭 사용해야 합니다.
 *        클래스명 : Store
 *        [필드명]      [접근 제어자]    [정보]
 *        name           private       이름
 *        location       private       위치
 *        rating         private       평점
 *
 *      [실행 결과]
 *       --출력--
 *        이름: 맛집, 위치: 서울, 평점: 4.5
 */
class Store {
    private String name;
    private String location;
    private double rating;

    public Store(String name, String location, double rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }
    String str () {
        return "이름: "+name+", 위치: "+location+", 평점: "+rating;
    }
}

public class Exam15 {
    public static void main(String[] args) {
        Store store = new Store("맛집", "서울", 4.5);
        System.out.println(store.str());
    }
}
