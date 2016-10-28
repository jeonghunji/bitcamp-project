package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp {
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    LecController lecController = new LecController(keyScan);
    System.out.println("비트캠프 관리 시스템에 오신걸 환영합니다.");
    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase();


      switch (command) {
        case "add": lecController.doAdd(); break;
        case "list": lecController.doList(); break;
        case "view": lecController.doView(); break;
        case "delete": lecController.doDelete(); break;
        case "quit":
          System.out.println("Good bye!");
          break loop;
        default:
          System.out.println("지원하지 않는 명령어 입니다.");
      }
    }
  }
}
