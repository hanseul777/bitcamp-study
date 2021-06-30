package net.hb.day0628;

public class TestBook {

  public int m = 7800;

  public static void main(String[] args) {
    //    TestBook tb = new TestBook();
    //    tb.note();
    //new TestBook().note();  익명의 개체 -> 이런방식으로도 많이 사용

    char a = 'A', b = 'B', c = 57; // c='9'  48~ 
    System.out.println(a + "\t" + b + "\t" + c);
    int x = a;
    int y = b;
    int z = c; //char를 int로 변환
    System.out.println(x + "\t" + y + "\t" + z);
    System.out.println();

  }

  public void note() { // Non-static메소드
    int m = 2400;
    System.out.println("지역변수 책가격 = " + m); //2400
    System.out.println("전역변수 책가격 = " + this.m); //7800
  }

}//class END
