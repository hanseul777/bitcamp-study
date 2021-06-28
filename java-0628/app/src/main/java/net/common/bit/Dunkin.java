package net.common.bit;

public class Dunkin {

  public String coffee() { 
    //Non-static메소드, 리턴값
    //주문할 때 = 필요할 때 메모리에 로드
    //객체화생성 후 객체명.coffee();
    String kind = "아이스티";
    return kind;
  }//end

  public static void donuts(int cnt) {
    //static메소드 메소드(매개인자)
    System.out.println("도너츠메소드 주문갯수 "+cnt+" 입니다.");
    //Dunkin.donuts(3);//접근
  }

  public void menu() { //리턴값X, 매개인자X

  }
}

