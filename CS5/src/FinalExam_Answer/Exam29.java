package FinalExam_Answer;

/**
 * 문제29. 도서의 제목, 저자, 출판사의 정보를 저장할 수 있는 Book 클래스를 정의합니다.
 *        그리고 이를 상속받아 Fiction과 NonFiction 클래스를 작성합니다.
 *        각 도서의 정보를 출력하고, 제목에 특정 키워드가 포함된 도서를 출력하는 프로그램을 작성하세요.
 *
 *        클래스명 : Book
 *        [필드명]      [접근 제어자]    [정보]
 *        title        private         제목
 *        author       private         저자
 *        publisher    private         출판사
 *
 *        클래스명 : Fiction (Book 상속)
 *        클래스명 : NonFiction (Book 상속)
 *        
 *        클래스명: Exam29
 *        [객체배열]    [배열 길이]    [정보]
 *        Book         3            도서의 제목, 저자, 출판사 저장
 *
 *      [실행 결과]
 *       -------
 *       제목: 소설가 구보씨의 하루
 *       저자: 박태원
 *       출판사: 문학과지성사
 *       -------
 *       제목: 알고리즘 문제 해결 전략
 *       저자: 구종만
 *       출판사: 인사이트
 *       -------
 *       제목: 자바의 정석
 *       저자: 남궁성
 *       출판사: 도우출판
 */

public class Exam29 {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Fiction("소설가 구보씨의 하루", "박태원", "문학과지성사");
        books[1] = new NonFiction("알고리즘 문제 해결 전략", "구종만", "인사이트");
        books[2] = new NonFiction("자바의 정석", "남궁성", "도우출판");

        String keyword = "자바";
        for (Book book : books) {
            if (book.getTitle().contains(keyword)) {
                book.printInfo();
            }
        }
    }
}

class Book {
    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void printInfo() {
        System.out.println("-------");
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("출판사: " + publisher);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, String publisher) {
        super(title, author, publisher);
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, String publisher) {
        super(title, author, publisher);
    }
}