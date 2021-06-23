package com.eomcs;

import java.util.Date;
import java.util.Scanner;

// 01. main() : 프로그램의 entry point
// 02. 사용자로부터 명령어 입력 받기
// 03. 사용자로부터 계속 명령어 입력 받기
// 04. quit 명령어를 입력 받았을 때 반복 종료
// 05. 명령어 별로 실행을 분기하기
// 06. 게시글 입력 받기
// 07. 배열을 이용하여 여러 개의 게시글 보관하기
// 08. 상수(final 변수)를 이용하여 배열의 크기를 다루기
// 09. 게시글 목록 출력하기
// 10. 게시글 상세 조회
// 11. 게시글 조회수 추가하기
// 12. 게시글 등록일 추가하기
// 13. 게시글 변경하기
// 14. 게시글 삭제하기
// 15. 메소드 문법을 이용하여 기능 별로 명령어를 묶어 관리하기
//16. 클래스를 이용하여 새 데이터타입을 정의하기

public class AppPractice {

  static final int BOARD_LENGTH = 200;
  static String [] titles = new String[BOARD_LENGTH];
  static String [] contents = new String[BOARD_LENGTH];
  static String [] passwords = new String[BOARD_LENGTH];
  static Date [] createdDates = new Date[BOARD_LENGTH];
  static int [] viewCounts = new int[BOARD_LENGTH];
  static int size = 0;
  static int index;
  static Scanner keyScan = new Scanner(System.in);

  public static void main (String[] args) {

    System.out.println("[게시판 관리]");

    loop: while (true) {

      System.out.print("명령> ");
      String command = keyScan.nextLine();

      switch (command) {
        case "list": list(); break;

        case "add": add(); break;

        case "update": update(); break;

        case "delete": delete(); break;

        case "view": view(); break;

        case "quit":
          break loop; 
        default:
          System.out.println("유효하지 않은 명령");
      }
    }

    keyScan.close();

    System.out.println("안녕히 가세요!");
  }

  static void list () {
    System.out.println("[게시글 목록]");

    for (int i = 0; i < size; i++) {
      System.out.printf("%d,%s,%d\n", i, titles[i], viewCounts[i]);
    }
  }

  static void add() {
    System.out.println("[게시글 등록]");

    if (size == BOARD_LENGTH) {
      System.out.println("더이상 생성할 수 없음");
      return;
    }

    System.out.print("제목? ");
    titles[size] = keyScan.nextLine();

    System.out.print("내용? ");
    contents[size] = keyScan.nextLine();

    System.out.print("비밀번호? ");
    passwords[size] = keyScan.nextLine();

    createdDates[size] = new Date();

    size++;
  }

  static void update() {
    System.out.println("[게시글 변경]");

    System.out.println("번호? ");
    int index =Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index > size) {
      System.out.println("유효하지 않음");
      return;
    }

    System.out.printf("제목(%s)? ", titles[index]);
    String title = keyScan.nextLine();

    System.out.printf("내용(%s)? ", contents[index]);
    String content = keyScan.nextLine();

    System.out.println("정말로 변경하시겠습니까? (y/n)");

    if(!keyScan.nextLine().equals("y")) {
      System.out.println("변경을 취소합니다.");
      return;
    }

    titles[index] = title;
    contents[index] = content;

    System.out.println("변경완료");
  }

  static void delete() {
    System.out.println("[게시글 삭제]");

    System.out.println("번호? ");

    index =Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index > size) {
      System.out.println("유효하지 않음");
      return;
    }

    System.out.println("정말로 삭제하시겠습니까? (y/n)");            

    if(!keyScan.nextLine().equals("y")) {
      System.out.println("삭제를 취소합니다.");
      return;
    }

    for (int i = index; i < size - 1; i++) {
      titles[i] = titles[i + 1];
      contents[i] = contents[i + 1];
      viewCounts[i] = viewCounts[i + 1];
      createdDates[i] = createdDates[i + 1];
    }
    size--;

    System.out.println("삭제완료");

  }

  static void view() {
    System.out.println("[게시글 조회]");
    System.out.println("번호? ");

    index =Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index > size) {
      System.out.println("유효하지 않음");
      return;
    }

    viewCounts[index]++;

    System.out.printf("제목: %s\n", titles[index]);
    System.out.printf("내용: %s\n", contents[index]);
    System.out.printf("암호: %s\n", passwords[index]);
    System.out.printf("등록일: %1$tY-%1$tm-%1$td  %1$tH:%1$tM:%1$tS\n", createdDates[index]);
  }
}


