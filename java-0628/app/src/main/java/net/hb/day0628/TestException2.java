package net.hb.day0628;

public class TestException2 {

  public static void main(String[] args) {

    int su1 = 9;
    int su2 = 0;
    int mul = 0, mok = 0;

    try {
      mul = su1+su2 ;
      mok = su1/su2 ;
    } catch(Exception ex) {}

    System.out.println();
    System.out.println(su1 + "*" + su2 + "=" + mul);
    System.out.println(su1 + "/" + su2 + "=" + mok);

    //    boolean[] camp = new boolean[5];
    //    System.out.println(camp[1]);
    //    System.out.println(camp[4]);

    System.out.println("\n***** 까사노의 1학기점수 *****");
    System.out.println("국어=90");
    System.out.println("영어=85");
    System.out.println("총접=175");
  }

}//TestException class END
