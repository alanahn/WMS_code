package FinalExam_Eunseok;

/**
 * [15점]문제12. 간단한 게임 캐릭터 클래스를 활용하여 게임의 진행을 시뮬레이션하는 프로그램을 작성하세요.
 * 
 * 게임 캐릭터는 이름과 레벨을 가지며, 공격력과 방어력을 포함한 추가 정보를 출력할 수 있어야 합니다.
 * 
 * 게임 진행 과정은 다음과 같습니다:
 * 1. 캐릭터 생성 및 초기 정보 출력
 * 2. 몬스터와의 전투 시작
 *    - 전투에서 승리할 경우에만 경험치 획득 및 레벨 업을 진행합니다.
 * 3. 새로운 레벨에 따른 공격력과 방어력을 계산하여 출력합니다.
 * 4. 게임 종료
 * 
 * 게임 캐릭터 클래스의 구조는 다음과 같습니다:
 * 클래스명: GameCharacter
 * [필드]
 * - name: String (캐릭터 이름)
 * - level: int (캐릭터 레벨)
 * - attackPower: int (공격력)
 * - defensePower: int (방어력)
 * 
 * [메소드]
 * - 생성자: name과 level을 받아 초기화, attackPower와 defensePower는 level에 따라 설정
 * - attackPower은 레벨업 때 마다 level * 5으로 증가
 * - defensePower는 레벨업 때 마다 level * 2로 증가
 * - printInfo(): 캐릭터 정보 출력 (이름, 레벨, 공격력, 방어력)
 * - levelUp(): 레벨을 1 증가시키고, attackPower와 defensePower를 업데이트하여 출력
 * 
 * 게임 진행 코드는 Exam12 클래스에 작성하며, 다음과 같은 실행 결과를 출력해야 합니다:
 * 
 * [실행 결과 예시]
 * -------
 * 캐릭터 생성 및 초기 정보 출력
 * 이름: 은석
 * 레벨: 1
 * 공격력: 5
 * 방어력: 1
 * -------
 * 몬스터와의 전투 시작!
 * 전투에서 승리하였습니다!
 * 경험치를 획득하여 레벨이 2가 되었습니다!
 * 새로운 공격력: 10
 * 새로운 방어력: 4
 * -------
 * 게임 종료
 */

public class Exam12 {
    public static void main(String[] args) {
        // 캐릭터 생성

        System.out.println("캐릭터 생성 및 초기 정보 출력");
        // 초기 정보 출력
        System.out.println("-------");

        // 몬스터와의 전투 시작
        System.out.println("몬스터와의 전투 시작!");

        // 전투 결과에 따라 처리
        boolean win = true; // 전투에서 승리했다고 가정
        if (win) {
            System.out.println("전투에서 승리하였습니다!");
            // 레벨업 메서드 실행
            System.out.println("-------");
        } else {
            System.out.println("전투에서 패배하였습니다.");
        }

        // 게임 종료
        System.out.println("게임 종료");
    }
}

class GameCharacter {
    // 필드


    // 생성자
    

    // calculateAttackPower 메소드


    // calculateAttackPower 메소드


    // printInfo 메소드


    // levelUp 메소드
    

}
