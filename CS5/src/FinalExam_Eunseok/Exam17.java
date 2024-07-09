package FinalExam_Eunseok;

/**
 * [10점]문제17. 책의 제목, 저자, 가격의 정보를 저장할 수 있는 Book 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 객체 배열의 길이는 3이며 책의 가격 정보를 변경시킬 수 있는 메소드와
 *        책 정보를 출력하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *
 *        클래스명 : Book
 *        [필드명]      [접근 제어자]    [정보]
 *        title        private         제목
 *        author       private         저자
 *        price        private         가격
 *
 *
 *        클래스명: Exam17
 *        [객체배열]    [배열 길이]    [정보]
 *        Book         3            책의 제목, 저자, 가격 저장
 *
 *      [실행 결과]
 *       -------
 *       제목: 자바의 정석
 *       저자: 브로디
 *       가격: 10000
 *       -------
 *       제목: 토비의 스프링
 *       저자: 다니엘
 *       가격: 45000
 *       -------
 *       제목: 이펙티브 자바
 *       저자: 스티브
 *       가격: 35000
 */

public class Exam17 {
    public static void main(String[] args) {
        Book[] book = new Book[3];
        book[0] = new Book("자바의 정석", "브로디", "10000");
        book[1] = new Book("토비의 스프링", "다니엘", "45000");
        book[2] = new Book("이펙티브 자바", "스티브", "35000");
        book[0].printInfo();
        book[1].printInfo();
        book[2].printInfo();
    }
}

class Book {
    private String title;
    private String author;
    private String price;

    public Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("-------");
        System.out.println("제목: " + this.title);
        System.out.println("저자: " + this.author);
        System.out.println("가격: " + this.price);
    }
}

