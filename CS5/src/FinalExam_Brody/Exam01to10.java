package FinalExam_Brody;

/**
 * 시간 : 1시간 30분(90분)
 * 문제 : 18문제(객관식 10문제[각 2점씩] + 주관식 8문제)
 * 
 * @author 이름 ex. 김아무개
 */

public class Exam01to10 {
    public static void main(String[] args) {
        Exam00();
        Exam01();
        Exam02();
        Exam03();
        Exam04();
        Exam05();
        Exam06();
        Exam07();
        Exam08();
        Exam09();
        Exam10();
    }

    /*
     * [예시 문제]
     * 문제0. 다음 중 듣고 있는 수업의 언어를 고르세요.
     * 1) C
     * 2) Java
     * 3) Python
     * 4) Kotlin
     */
    private static void Exam00() {
        // " "사이에 정답이라고 생각되는 번호(ex."2")를 입력하세요.
        // 답이 두 개일 경우 "2,3"으로 입력하세요.
        System.out.println("[문제0]: " + "2");
    }

    /*
     * 문제1. 다음 중 자바의 특징으로 틀린 것을 고르세요.
     * 1) 객체 중심 개발이다.
     * 2) 절차 지향 언어이다.
     * 3) 가상 머신(JVM)을 활용해 플랫폼에 영향을 받지 않아 다양한 환경에서 사용 가능하다.
     * 4) 보안이 강하기 때문에 프로그램이 안정적이다.
     */
    private static void Exam01() {
        System.out.println("[문제1]: " + "2"); //0
    }

    /*
     * 문제2. 다음 중 패키지에 대한 설명으로 올바른 것을 고르세요.
     * 1) 프로그램 전체에 접근 가능한 접근 제어자이다.
     * 2) 클래스 안에 만들어진 메소드이다.
     * 3) 서로 비슷한 성격의 자바 클래스들을 모아 놓은 폴더이다.
     * 4) 표준 입출력 클래스이다.
     */
    private static void Exam02() {
        System.out.println("[문제2]: " + "3"); //0
    }

    /*
     * 문제3. 다음 중 인덱스의 범위에 대한 설명으로 올바른 것을 고르세요.
     * 1) 1부터 배열의 길이-1
     * 2) 0부터 배열의 길이-1
     * 3) 0부터 배열의 길이
     * 4) 1부터 배열의 길이
     */
    private static void Exam03() {
        System.out.println("[문제3]: " + "3"); //X 2
    }

    /*
     * 문제4. 다음 중 배열을 선언하거나 초기화한 것 중 틀린 것을 고르세요.
     * 1) int[] arr = new int[5]{1,2,3,4,5};
     * 2) int arr[3];
     * 3) int[] arr = {1,2,3,4};
     * 4) int[]arr = new int[5];
     */
    private static void Exam04() {
        System.out.println("[문제4]: " + "1"); //X 2
    }

    /*
     * 문제5. 다음 중 접근 제어자에 관한 설명으로 올바른 것을 고르세요.
     * 1) public – 서로 다른 패키지 내에서만 접근 가능
     * 2) private – 같은 패키지 내에서만 접근 가능
     * 3) protected – 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근 가능
     * 4) default – 같은 클래스 내에서만 접근 가능
     * 
     */
    private static void Exam05() {
        System.out.println("[문제5]: " + "3"); //0
    }

    /*
     * 문제6. 클래스는 객체의 필드와 메소드로 구성되어 있다.
     * 1) O
     * 2) X
     */
    private static void Exam06() {
        System.out.println("[문제6]: " + "O"); //0
    }

    /*
     * 문제7. 객체 지향 프로그래밍의 특징이 아닌 것을 고르세요.
     * 1) 절차 지향
     * 2) 캡슐화
     * 3) 다형성
     * 4) 상속
     */
    private static void Exam07() {
        System.out.println("[문제7]: " + "1"); //0
    }

    /*
     * 문제8. 다음 중 메소드의 올바른 선언이 아닌 것을 고르세요.
     * 1) private int myMethod(int a, int b) { return a + b; }
     * 2) public void myMethod() {}
     * 3) void myMethod() { return 0; }
     * 4) protected boolean myMethod() { return true; }
     */
    private static void Exam08() {
        System.out.println("[문제8]: " + "3"); //0

    }

    /*
     * 문제9. 다음 중 올바른 클래스 선언을 고르세요.
     * 1) private class MyClass {}
     * 2) public class MyClass {}
     * 3) void class MyClass {}
     * 4) protected class MyClass {}
     */
    private static void Exam09() {
        System.out.println("[문제9]: " + "2"); //0
    }

    /*
     * 문제10. 다음 중 생성자에 대한 설명으로 틀린 것을 고르세요.
     * 1) 생성자는 반환 타입이 없다.
     * 2) 생성자는 클래스와 이름이 동일하다.
     * 3) 생성자는 여러 개 정의할 수 없다.
     * 4) 생성자는 객체 생성 시 자동으로 호출된다.
     */
    private static void Exam10() {
        System.out.println("[문제10]: " + "3"); //0
    }
}
