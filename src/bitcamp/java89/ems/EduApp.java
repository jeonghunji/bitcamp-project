package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp{
  public static void main(String[] args) {
    System.out.println("비트캠프 관리 시스템에 오신걸 환영합니다.");

    Scanner keyScan = new Scanner(System.in);

    Lecture lec = new Lecture();
    System.out.print("강의이름 ?");
    lec.name = keyScan.nextLine();
    System.out.print("선생님성함 ?");
    lec.teacher = keyScan.nextLine();
    System.out.print("교실번호?(예 : 233)");
    lec.room = Integer.parseInt(keyScan.nextLine());
    System.out.print("강의주제 ?");
    lec.subject = keyScan.nextLine();
    System.out.print("수업시간 ?");
    lec.time = keyScan.nextLine();
    System.out.print("국가지원여부 (y/n)");
    lec.support = (keyScan.nextLine().equals("y")) ? true : false;
    System.out.print("강의료(예:18000)");
    lec.money = Integer.parseInt(keyScan.nextLine());
    System.out.print("강의번호");
    lec.noname = Integer.parseInt(keyScan.nextLine());

    System.out.printf("강의 이름 : %s \n", lec.name);
    System.out.printf("선생님 성함 : %s \n", lec.teacher);
    System.out.printf("교실번호 : %s \n", lec.room);
    System.out.printf("강의 주제 : %s \n", lec.subject);
    System.out.printf("수업시간 : %s \n", lec.time);
    System.out.printf("국가 지원여부 : %b \n", lec.support);
    System.out.printf("강의번호 : %d \n", lec.noname);


  }
}
