package FinalExam_Steve;

/**
 * [15점]문제18. 도서의 제목, 저자, 출판사의 정보를 저장할 수 있는 Book 클래스를 정의합니다.
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
 *        클래스명: Exam18
 *        [객체배열]    [배열 길이]    [정보]
 *        Book         3            도서의 제목, 저자, 출판사 저장
 *
 *      [실행 결과]
 *       -------
 *       제목: 소설가 구보씨의 하루
 *       저자: 프리드리힉
 *       출판사: 프코치님
 *       -------
 *       제목: 알고리즘 문제 해결 전략
 *       저자: 안길호
 *       출판사: WAYMAKERSCHOOL
 *       -------
 *       제목: 자바의 정석
 *       저자: 앨런
 *       출판사: WMS
 */

public class Exam18 {
public static void main(String[] args) {
    Book[] book = new Book[3];
    book[0] = new Fiction("소설가 구보씨의 하루", "프리드리힉", "프코치님");
    book[1] = new NonFiction("알고리즘 문제 해결 전략", "안길호", "WAYMAKERSCHOOL");
    book[2] = new NonFiction("자바의 정석", "앨런", "WMS");
    String search = "소설";
    
    for(int i = 0; i<book.length; i++){
        if(book[i].getTitle().contains(search)){
        System.out.println("-------");
        System.out.println("제목: " + book[i].getTitle());
        System.out.println("저자: " + book[i].getAuthor());
        System.out.println("출판사: " + book[i].getPublisher());
        }
        
    }


}
}
class Book{
    private String title;
    private String author;
    private String publisher;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    

}
class NonFiction extends Book{

    public NonFiction(String title, String author, String publisher) {
        super(title, author, publisher);
    }
}
class Fiction extends Book{

    public Fiction(String title, String author, String publisher) {
        super(title, author, publisher);
    }

}