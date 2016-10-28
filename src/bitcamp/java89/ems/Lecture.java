package bitcamp.java89.ems;

public class Lecture {
  //인스턴스 변수 만들기
  String name; //강의 이름
  String teacher; // 선생님이름
  int room; // 교실 번호
  String subject; // 강의 주제
  String time; // 수업 시간
  boolean support; // 지원여부
  int money; // 강의료
  int noname;// 강의 번호


  public Lecture() {}

  public Lecture(String name, int noname, String subject) {
    this.name = name;
    this.noname = noname;
    this.subject = subject;
  }










}
