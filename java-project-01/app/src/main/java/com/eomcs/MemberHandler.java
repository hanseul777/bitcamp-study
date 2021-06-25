package com.eomcs;

import java.util.Date;
import java.util.Scanner;

public class MemberHandler implements Handler {

  // 사용자 정의 데이터 타입
  // => 도메인 객체(domain object)
  // => 값 객체 (value object; VO)
  // => 데이터 전송 객체(Date Transfer Object; DTO)
  // => 모델 객체

  class Member {
    String name;
    String email;
    String password;
    boolean working;
    Date registeredDate;
  }

  //인터페이스 : 호출하는 쪽과 호출당하는 쪽에서 지켜야 할 규칙. -> 호출할 때 일관된 이름을 사용.

  String memberGroupName;
  Scanner keyScan;
  ArrayList memberList = new ArrayList();

  MemberHandler(Scanner keyScan) {
    this.keyScan = keyScan;
    this.memberGroupName = "일반";
  }

  MemberHandler(String memberGroupName, Scanner keyScan) {
    this.memberGroupName = memberGroupName;
    this.keyScan = keyScan;
  }

  public void execute() { //implements를 사용하기 위해 public으로 바꿔줌. 
    loop: while (true) {
      // 인스턴스 메서드에서 인스턴스 변수를 사용할 때
      // this를 생략할 수 있다. -> 인스턴스변수가 자동으로 생성
      System.out.print(/*this.*/memberGroupName + "/회원 관리 > ");
      String command = keyScan.nextLine();


      switch (command) {
        case "list" : list() ; break;
        case "add" : add(); break; //같은 클래스안에 있기 때문에 MemberHandler.add();로 표현하지 않아도 괜찮
        case "update" : update(); break;
        case "delete" : delete(); break;
        case "view" : view(); break;
        case "back" :
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
      System.out.println();
    }
  }

  void add() {
    System.out.println("[회원 등록]");

    if (memberList.size == ArrayList.MAX_LENGTH) { //BoardHandler를 한 번 실행했다면 다시 두 번째 사용할 때는 호출 x : 클래스는 한 번만 실행
      System.out.println("더이상 회원을 추가할 수 없습니다.");
      return;
    }

    // 한 개의 회원 데이터를 저장할 변수를 준비한다.
    // Member 설계도에 따라 변수를 만들고 그 주소를 리턴한다.
    Member member = new Member(); // new Member로 생성한 인스턴스배열의 첫주소가 member라는 레퍼런스에 들어감.

    System.out.print("이름: ");
    member.name = keyScan.nextLine();

    System.out.print("이메일: ");
    member.email = keyScan.nextLine();

    System.out.print("비밀번호: ");
    member.password = keyScan.nextLine();

    System.out.print("재직여부:(y/N) ");
    if (keyScan.nextLine().equals("y")) {
      member.working = true;
    } else {
      member.working = false;
    }

    member.registeredDate = new Date(); // 현재의 날짜와 시간을 생성하여 배열에 저장한다.


    memberList.append(member); // arraylist의 append를 실행한 값에 member(레퍼런스)값이 들어감.

    System.out.println("회원을 등록했습니다.");
  }

  void list() {
    System.out.println("[회원 목록]");

    Object[] arr = memberList.toArray(); //memberList값을 뽑아서 arr배열을 실행. 값을 ArrayList에서 가져와라

    for (int i = 0; i < arr.length; i++) { //arr의 크기만큼 한개씩 obj라는 변수에 담아서 처음부터끝까지 실행 (할 때는 이게 편함.)
      Member member = (Member) arr[i];  // Object배열(arr[i])에는 name(변수)이 없기 때문에 Member로 형변환.
      System.out.printf("%d, %s, %s, %b\n", 
          i, 
          member.name,
          String.format("%1$tY-%1$tm-%1$td", member.registeredDate),
          member.working);
    }
  }

  void view() {
    System.out.println("[회원 조회]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    Member member = (Member) memberList.retrieve(index);

    System.out.printf("이름: %s\n", member.name);
    System.out.printf("이메일: %s\n", member.email);
    System.out.printf("등록일: %1$tY-%1$tm-%1$td\n", member.registeredDate);
    System.out.printf("재직중: %s\n", member.working ? "예" : "아니오");
    //member레퍼런스가 가리키는 working값에 따라 예와 아니오가 따로나옴 (조건연산자사용. 조건문이 아님!)
  }

  void update() {
    System.out.println("[회원 변경]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    Member member = (Member) memberList.retrieve(index);

    System.out.printf("이름(%s)? " , member.name);
    String name = keyScan.nextLine();

    System.out.printf("이메일(%s)? ", member.email);
    String email = keyScan.nextLine();

    System.out.printf("암호? ");
    String password = keyScan.nextLine(); //기존암호유출없게

    System.out.printf("재직중(%s)? (y/N) ", member.working ? "예" : "아니오");
    boolean working = false; //기본을 false로 설정
    if (keyScan.nextLine().equals("y")) {
      working = true; //기본값이 false이기 때문에 else없어도 괜찮음.
    }

    System.out.print("정말 변경하시겠습니까?(y/N) ");
    if (!keyScan.nextLine().equals("y")) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    } 

    // 배열에서 꺼낸 인스턴스의 각 변수 값을 바꾼다.
    member.name = name;
    member.email = email;
    member.password = password;
    member.working = working;

    System.out.println("회원을 변경하였습니다.");
  }

  void delete() {
    System.out.println("[회원 삭제]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= memberList.size) {
      System.out.println("무효한 회원 번호입니다.");
      return;
    }

    System.out.print("정말 삭제하시겠습니까?(y/N) ");
    if (!keyScan.nextLine().equals("y")) {
      System.out.println("회원 삭제를 취소하였습니다.");
      return;
    } 

    memberList.remove(index); // 같은클래스의 같은 메서드(ArrayList)를 사용하지만 memberList라는 배열의 index번째 값을 지워라(remove)

    System.out.println("회원을 삭제하였습니다.");
  }


}


