package net.hb.day0628;

import net.common.bit.Dunkin;

public class UserDK {
  public static void main(String[] args) {
    //Q) Dunkin클래스에 coffee메소드와 donuts메소드 호출

    System.out.println("3:35분 오후 UserDK클래스");
    Dunkin.donuts(3);

    Dunkin dk = new Dunkin(); // Dunkin의 coffee메서드를 불러오기위해 일단 객체를 먼저 불러옴
    String msg = dk.coffee(); // 메서드에 입력되어있던 문자열을 불러옴
    System.out.println("주문한음료는 "+msg+" 입니다."); // 출력
  }

}
