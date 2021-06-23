package com.eomcs;

import java.util.Date;
import java.util.Scanner;
import com.eomcs.App.Board;

public class BoardHandlerPractice {

  static final int BOARD_LENGTH = 200;
  static Board[] boards = new Board[BOARD_LENGTH];
  static int size = 0;
  static int index;
  static Scanner keyScan;


  static void list () {
    System.out.println("[게시글 목록]");

    for (int i = 0; i < size; i++) {
      Board board = boards[i];
      System.out.printf("%d,%s,%s,%d\n", 
          i, 
          board.title,
          String.format("%1$tY-%1$tm-%1$td", board.createdDate),
          board.viewCount);
    }
  }

  static void add() {
    System.out.println("[게시글 등록]");

    if (size == BOARD_LENGTH) {
      System.out.println("더이상 생성할 수 없음");
      return;
    }

    Board board = new Board();

    System.out.print("제목: ");
    board.title = keyScan.nextLine();

    System.out.print("내용: ");
    board.content = keyScan.nextLine();

    System.out.print("비밀번호: ");
    board.password = keyScan.nextLine();

    board.createdDate = new Date();

    boards[size++] = board;

    System.out.println("게시글을 등록했습니다.");
  }

  static void update() {
    System.out.println("[게시글 변경]");

    System.out.print("번호? ");
    int index =Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= size) {
      System.out.println("유효하지 않음");
      return;
    }

    Board board = boards[index];

    System.out.printf("제목(%s)? ", board.title);
    String title = keyScan.nextLine();

    System.out.printf("내용(%s)? ", board.content);
    String content = keyScan.nextLine();

    System.out.print("정말로 변경하시겠습니까? (y/n)");
    if(!keyScan.nextLine().equals("y")) {
      System.out.println("변경을 취소합니다.");
      return;
    }

    board.title = title;
    board.content = content;

    System.out.println("변경완료");
  }

  static void delete() {
    System.out.println("[게시글 삭제]");

    System.out.print("번호? ");

    int index =Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= size) {
      System.out.println("유효하지 않음");
      return;
    }

    System.out.print("정말로 삭제하시겠습니까? (y/n)");            

    if(!keyScan.nextLine().equals("y")) {
      System.out.println("삭제를 취소합니다.");
      return;
    }

    for (int i = index; i < size - 1; i++) {
      boards[i] = boards[i + 1];
    }
    size--;

    System.out.println("삭제완료");

  }

  static void view() {
    System.out.println("[게시글 조회]");
    System.out.print("번호? ");

    int index =Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= size) {
      System.out.println("유효하지 않음");
      return;
    }

    Board board = boards[index];

    board.viewCount++;

    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.content);
    System.out.printf("암호: %s\n", board.password);
    System.out.printf("등록일: %1$tY-%1$tm-%1$td  %1$tH:%1$tM:%1$tS\n", board.createdDate);
  }

}
