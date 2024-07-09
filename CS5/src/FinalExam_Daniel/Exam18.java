package FinalExam_Daniel;

/**
 * [15점]문제18. 동물의 이름, 나이, 소리의 정보를 저장할 수 있는 Animal 클래스를 정의합니다.
 *        그리고 이를 상속받아 Cat과 Dog 클래스를 작성합니다.
 *        고양이는 "야옹", 개는 "왈왈" 소리를 낼 수 있도록 초기화하고, 해당 소리를 출력하는 메소드를 정의합니다.
 *        동물들을 객체 배열로 만들어 소리를 출력하는 프로그램을 작성하세요.
 *
 *        클래스명 : Animal
 *        [필드명]    [접근 제어자]    [정보]
 *        name       private         이름
 *        age        private         나이
 *        sound      private         소리
 *
 *        클래스명 : Cat (Animal 상속)
 *        클래스명 : Dog (Animal 상속)
 *        
 *        클래스명: Exam18
 *        [객체배열]    [배열 길이]    [정보]
 *        Animal      3            동물의 이름, 나이, 소리 저장
 *
 *      [실행 결과]
 *       -------
 *       이름: 나비
 *       나이: 3
 *       소리: 야옹
 *       -------
 *       이름: 뽀삐
 *       나이: 2
 *       소리: 왈왈
 *       -------
 *       이름: 두부
 *       나이: 1
 *       소리: 야옹
 */

 class Book {
    private String name;
    private int age;
    private String sound;

    public Book(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    String printBook() {
        return "나비:" + name + "\n나이:" + age + "\n소리:" + sound;
    }
    
}

public class Exam18{
    public static void main(String[] args) {
        Book[] books = new Book[3];

        books[0] = new Book("나비", 3, "야옹");
        books[1] = new Book("뽀삐", 2, "왈왈");
        books[2] = new Book("두부", 1, "야옹");

        
        for (Book student : books) {
            System.out.println("-------");
            System.out.println(student.printBook());
        } 
    }
}