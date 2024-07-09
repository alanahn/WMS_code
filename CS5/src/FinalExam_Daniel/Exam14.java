package FinalExam_Daniel;

/**
 * [10점]문제14. 가게의 이름, 위치, 평점, 연락처의 정보를 저장할 수 있는 Store 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 가게의 정보를 출력하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *
 *        **주의 : 클래스를 꼭 사용해야 합니다.
 *        클래스명 : Store
 *        [필드명]      [접근 제어자]    [정보]
 *        name           private       이름
 *        location       private       위치
 *        rating         private       평점
 *        contact        private       연락처
 *
 *      [실행 결과]
 *       --출력--
 *        이름: 맛집, 위치: 서울, 평점: 4.5, 연락처: 031-8057-9309
 */

 class Store {
    private String name;
    private String location;
    private double rating;
    private String contact;

    public Store(String name, String location, double rating, String contact) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.contact = contact;
    }

    String printStore() {
        return ("이름: "+name+", 위치: "+location+", 평점:"+rating+", 연락처: "+contact);
    }
}

public class Exam14 {
    public static void main(String[] args) {
        Store cmd = new Store("맛집", "서울", 4.5, "031-8057-9309");
        System.out.println(cmd.printStore());
    }
}