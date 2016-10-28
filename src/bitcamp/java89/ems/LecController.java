package bitcamp.java89.jwave89.ems;
import java.util.Scanner;

public class LecController {
  static Lecture[] lecss = new Lecture[100];
  static int length = 0;
  static Scanner keyScan;

  static void doAdd() {
    while ( length < lecss.length) {
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
      lec.support = (keyScan.nextLine().equals("y")) ? true : false ;
      System.out.print("강의료(예:18000)");
      lec.money = Integer.parseInt(keyScan.nextLine());
      System.out.print("강의번호");
      lec.noname = Integer.parseInt(keyScan.nextLine());
      lecss[length++] = lec;

      System.out.print("계속 입력하시겠습니까(y/n)?");
      if (!keyScan.nextLine().equals("y"))
        break;

    }
  }
  static void doList() {

    for (int i = 0; i < length;  i++) {
    Lecture lec = lecss[i];
    System.out.printf("강의 이름 : %s \n", lec.name);
    System.out.printf("선생님 성함 : %s \n", lec.teacher);
    System.out.printf("교실번호 : %s \n", lec.room);
    System.out.printf("강의 주제 : %s \n", lec.subject);
    System.out.printf("수업시간 : %s \n", lec.time);
    System.out.printf("국가 지원여부 : %s \n", (lec.support)? "yes":"no");
    System.out.printf("강의번호 : %d \n", lec.noname);

    }
  }

  static void doView() {
    System.out.print("조회할 학생의 아이디는? ");
    String name = keyScan.nextLine().toLowerCase();
    for (int i = 0; i < length; i ++) {
      if (lecss[i].name.toLowerCase().equals(name)) {
        System.out.printf("강의이름 : %s\n", lecss[i].name);
        break;
      }
    }
  }
}
