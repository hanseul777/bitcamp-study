package net.hb.day0628;

public class TestNote {

  public static void main(String [] args) {
    System.out.println("차한슬 9:42");
    System.out.println("문빈 9:43");
    TestNote tn = new TestNote();

  }//main end

  public String book() { //문제1 같은 문서의 메소드호출
    String my = "꿈백화점" ; // 지역변수 = local variable -> 블럭안에서만 사용이 가능하다.
    return my; //return값을 줘서 book()이 my를 기억 -> 그래서 book도 void가 아니라 String으로 변환
  }

  public int price() {
    int money = 2700;
    return money;
  }

  public void note() { //Non-static메소드

    String title = book();
    System.out.println("책제목 =" + title);
    System.out.println("책제목 = " + book() ); //위아래 같은 방식. 편한 것으로 하기

    System.out.println("책가격 = " + price() );
  }

} // class END
