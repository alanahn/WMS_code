package FinalExam_Steve;

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
     * 2) 가상 머신(JVM)을 활용해 플랫폼에 영향을 받지 않아 다양한 환경에서 사용 가능하다.
     * 3) 절차 지향 언어이다.
     * 4) 보안이 강하기 때문에 프로그램이 안정적이다.
     */
    private static void Exam01() {
        System.out.println("[문제1]: " + "3"); //O
    }

    /*
     * 문제2. 다음 중 패키지에 대한 설명으로 올바른 것을 고르세요.
     * 1) 표준 입출력 클래스이다.
     * 2) 클래스 안에 만들어진 메소드이다.
     * 3) 프로그램 전체에 접근 가능한 접근 제어자이다.
     * 4) 서로 비슷한 성격의 자바 클래스들을 모아 놓은 폴더이다.
     */
    private static void Exam02() {
        System.out.println("[문제2]: " + "4"); //O
    }

    /*
     * 문제3. 다음 중 접근 제어자에 관한 설명으로 올바른 것을 고르세요.
     * 1) private – 같은 패키지 내에서만 접근 가능
     * 2) default – 같은 클래스 내에서만 접근 가능
     * 3) public – 서로 다른 패키지 내에서만 접근 가능
     * 4) protected – 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근 가능
     * 
     */
    private static void Exam03() {
        System.out.println("[문제3]: " + "4"); //O
    }

    /*
     * 문제4. 클래스는 객체의 필드와 메소드로 구성되어 있다.
     * 1) O
     * 2) X
     */
    private static void Exam04() {
        System.out.println("[문제4]: " + "O"); //O
    }

    /*
     * 문제5. 객체 지향 프로그래밍의 특징이 아닌 것을 고르세요.
     * 1) 절차 지향
     * 2) 다형성
     * 3) 캡슐화
     * 4) 상속
     */
    private static void Exam05() {
        System.out.println("[문제5]: " + "1"); //O
    }

    /*
     * 문제6. 다음 중 메소드의 올바른 선언이 아닌 것을 고르세요.
     * 1) private int myMethod(int a, int b) { return a + b; }
     * 2) protected boolean myMethod() { return true; }
     * 3) void myMethod() { return 0; }
     * 4) public void myMethod() {}
     */
    private static void Exam06() {
        System.out.println("[문제6]: " + "3"); //O
    }

    /*
     * 문제7. 다음 중 조건문에 대한 설명으로 틀린 것을 고르세요.
     * 1) if-else 문은 조건에 따라 두 가지 경우 중 하나를 실행한다.
     * 2) switch 문은 변수의 값에 따라 실행할 코드를 선택한다.
     * 3) 조건문은 반복문 안에서 사용할 수 없다.
     * 4) 삼항 연산자는 조건문을 간단하게 표현할 때 사용된다.
     */
    private static void Exam07() {
        System.out.println("[문제7]: " + "3"); //O
    }

    /*
     * 문제8. 다음 중 반복문에 대한 설명으로 틀린 것을 고르세요.
     * 1) 반복문 내에서 continue 문을 만나면 반복을 종료한다.
     * 2) for 문은 반복 횟수가 정해져 있을 때 사용된다.
     * 3) while 문은 조건이 참일 때 반복 실행된다.
     * 4) break 문은 반복문을 종료시킨다.
     */
    private static void Exam08() {
        System.out.println("[문제8]: " + "1"); //O
    }

    /*
     * 문제9. 다음 중 올바른 클래스 선언을 고르세요.
     * 1) protected class MyClass {}
     * 2) private class MyClass {}
     * 3) public class MyClass {}
     * 4) void class MyClass {}
     */
    private static void Exam09() {
        System.out.println("[문제9]: " + "3"); //O
    }

    /*
     * 문제10. 다음 중 생성자에 대한 설명으로 틀린 것을 고르세요.
     * 1) 생성자는 클래스와 이름이 동일하다.
     * 2) 생성자는 객체 생성 시 자동으로 호출된다.
     * 3) 생성자는 반환 타입이 없다.
     * 4) 생성자는 여러 개 정의할 수 없다.
     */
    private static void Exam10() {
        System.out.println("[문제10]: " + "2"); //X 4
    }
}
