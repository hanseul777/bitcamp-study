package net.hb.day0628;

public class BitCamp_4 extends Father implements AAA, BBB {
  public static void main(String[] args) {
    BitCamp_4 bc4 = new BitCamp_4();
    bc4.game();
  }// main END

  public void game() {
    System.out.println("집에가고싶다.");
    int m = this.bank();
  }

  @Override
  public void apple() {
    System.out.println("BitCamp_4");
  }

  @Override
  public void blue() {
    // TODO Auto-generated method stub

  }

  @Override
  public String memo() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean nullCheck(int key) {
    // TODO Auto-generated method stub
    return false;
  }
}// class END
