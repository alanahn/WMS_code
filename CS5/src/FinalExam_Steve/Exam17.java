package FinalExam_Steve;

import java.util.Arrays;

/**
 * [10점]문제17. 도시의 이름, 인구, 면적의 정보를 저장할 수 있는 City 클래스를 정의합니다.
 *        그리고 생성자로 초기화합니다. 객체 배열의 길이는 3이며 도시의 인구 정보를 변경시킬 수 있는 메소드와
 *        도시 정보를 출력하는 메소드도 함께 정의하는 프로그램을 만들어 제출하세요.
 *
 *        클래스명 : City
 *        [필드명]      [접근 제어자]    [정보]
 *        name         private         이름
 *        population   private         인구
 *        area         private         면적
 *
 *
 *        클래스명: Exam17
 *        [객체배열]    [배열 길이]    [정보]
 *        City         3            도시의 이름, 인구, 면적 저장
 *
 *      [실행 결과]
 *       -------
 *       이름: 서울
 *       인구: 10000000
 *       면적: 605
 *       -------
 *       이름: 경기
 *       인구: 5000000
 *       면적: 1000
 *       -------
 *       이름: 대구
 *       인구: 2500000
 *       면적: 884
 */

public class Exam17 {
public static void main(String[] args) {
    City[] city = new City[3];
    city[0] = new City("서울", 10000000, 605);
    city[1] = new City("경기", 5000000, 1000);
    city[2] = new City("대구", 2500000, 884);
    for(int i = 0; i<city.length; i++){
        city[i].printcity();
    }
}
}
class City{
    private String name;
    private int population;
    private int area;
    public City(String name, int population, int area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }
    public void printcity(){
        System.out.println("-------");
        System.out.println("이름: " + name);
        System.out.println("인구: "+ population);
        System.out.println("면적: " + area);
    }


    }
    

