package net.hb.day0628;

import java.io.InputStream;

public class Work02emp {

  public static void main(String[] args) {
    try {
      //    자바에서 표준입력 ascii코드 byte형태
      //    자바에서 표준입력 System.in 키보드입력
      //java.util패키지 Scanner생성자3번째(InputStream)

      InputStream is = System.in ;  // ascii코드

      /*Scanner sc1 =  new Scanner(is);
    Scanner sc2 =  new Scanner(System.in); // 표준 text */

      System.out.print("단입력 : ");
      int dan = is.read(); // read()를 사용할거면 무조건 예외처리해야함.
      for(int a=1; a<10; a++) {
        System.out.println(dan + "*" + a + "=" + (dan*a));
      }

    } catch (Exception e) {}

  }// end
}// class END
