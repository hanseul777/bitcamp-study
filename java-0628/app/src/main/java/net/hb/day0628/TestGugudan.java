package net.hb.day0628;

public class TestGugudan {

  public static void main(String[] args) {

    int dan = 3;
    for (int i=1; i<10; i++) {
      System.out.println(dan+"*"+i+"="+(dan*i));
      //      Thread.sleep(500);  <- 자바에서 문법적인 에러가 나는 문장(오류가 Unhandler Exception으로 뜸)
      try { Thread.sleep(500); } catch (Exception e) {}//결과가 하나씩 천천히 나옴. : Tread.sleep(500 = 0.5초)
    }

    System.out.println();
    System.out.println("우리나라");
    System.out.println("대한민국");
    System.out.println("금수강산");
  }

}//TestException class END
