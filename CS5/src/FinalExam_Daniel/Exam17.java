package FinalExam_Daniel;

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
 *       저자: 다니엘
 *       가격: 100000
 *       -------
 *       제목: 토비의 스프링
 *       저자: 브로디
 *       가격: 20000
 *       -------
 *       제목: 이펙티브 자바
 *       저자: 조슈아
 *       가격: 50000
 */

 class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    String printBook() {
        return "제목:" + title + "\n저자:" + author + "\n가격:" + price;
    }
    
}

public class Exam17 {

    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book("자바의 정석", "다니엘", 10000);
        books[1] = new Book("토비의 스프링", "브로디", 20000);
        books[2] = new Book("이펙티브 자바", "조슈아", 50000);

        
        for (Book student : books) {
            System.out.println("-------");
            System.out.println(student.printBook());
        } 
    }
}