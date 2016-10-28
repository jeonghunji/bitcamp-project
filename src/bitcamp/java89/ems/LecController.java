package bitcamp.java89.ems;
import java.util.Scanner;

public class LecController {
  Lecture[] lecss = new Lecture[100];
  int length = 0;
  Scanner keyScan;


  public LecController (Scanner keyScan) {
    this.keyScan = keyScan;
  }

  public void doAdd() {
    while ( length < this.lecss.length) {
      Lecture lec = new Lecture();

      System.out.print("강의이름 ?");
      lec.name = this.keyScan.nextLine();

      System.out.print("선생님성함 ?");
      lec.teacher = this.keyScan.nextLine();

      System.out.print("교실번호?(예 : 233)");
      lec.room = Integer.parseInt(this.keyScan.nextLine());

      System.out.print("강의주제 ?");
      lec.subject = this.keyScan.nextLine();

      System.out.print("수업시간 ?");
      lec.time = this.keyScan.nextLine();

      System.out.print("국가지원여부 (y/n)");
      lec.support = (this.keyScan.nextLine().equals("y")) ? true : false ;

      System.out.print("강의료(예:18000)");
      lec.money = Integer.parseInt(this.keyScan.nextLine());

      System.out.print("강의번호");
      lec.noname = Integer.parseInt(this.keyScan.nextLine());
      this.lecss[length++] = lec;

      System.out.print("계속 입력하시겠습니까(y/n)?");
      if (!keyScan.nextLine().equals("y"))
        break;

    }
  }
  public void doList() {

    for (int i = 0; i < this.length;  i++) {
    Lecture lec = this.lecss[i];
    System.out.printf("강의 이름 : %s \n", lec.name);
    System.out.printf("선생님 성함 : %s \n", lec.teacher);
    System.out.printf("교실번호 : %s \n", lec.room);
    System.out.printf("강의 주제 : %s \n", lec.subject);
    System.out.printf("수업시간 : %s \n", lec.time);
    System.out.printf("국가 지원여부 : %s \n", (lec.support)? "yes":"no");
    System.out.printf("강의번호 : %d \n", lec.noname);

    }
  }

  public void doView() {
    System.out.print("조회할 학생의 아이디는? ");
    String name = this.keyScan.nextLine().toLowerCase();
    for (int i = 0; i < this.length; i ++) {
      if (this.lecss[i].name.toLowerCase().equals(name)) {
        System.out.printf("강의이름 : %s\n", this.lecss[i].name);
        System.out.printf("선생님 성함 : %s \n", this.lecss[i].teacher);
        System.out.printf("교실번호 : %s \n", this.lecss[i].room);
        System.out.printf("강의 주제 : %s \n", this.lecss[i].subject);
        System.out.printf("수업시간 : %s \n", this.lecss[i].time);
        System.out.printf("국가 지원여부 : %s \n", (this.lecss[i].support)? "yes":"no");
        System.out.printf("강의번호 : %d \n", this.lecss[i].noname);

        break;
      }
    }
  }
}
