package net.hb.day0628;

public class LottoUser {

  public static void main(String[] args) {

    int [] ret = Lotto.input(); //return값이 여러개 -> 배열로 받는다. : 출력의 목적이 없음
    Lotto.output(ret);

    Lotto LG = new Lotto();
    int value = LG.inputSum();
    //    int value =  Lotto.inputSum(); // 리턴값을 안받으면 그냥 호출, 에러는 없지만 의미가 없음.
    System.out.println("숫자합계 = " + value);
    System.out.println("숫자합계 = " + Lotto.inputSum());

    System.out.println();
    System.out.println("LottoUser.java 10:08");    
  }


} // class END
