package net.hb.day0628;

public class BitCamp_2 extends LA { //LA상속

  public static void main(String[] args) {
    BitCamp_2 bc = new BitCamp_2();
    bc.book();

  }// main END

  public void book() {
    System.out.println("book");
    super.cherry(); //부모클래스 접근  super, this모두 static에서는 사용 불가.
    this.cherry(); //this는 생략가능
  }

  @Override // 생략가능
  public void cherry() {
    System.out.println("제주산 체리 10:48");
  }



}// class END
