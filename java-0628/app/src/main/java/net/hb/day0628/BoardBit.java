package net.hb.day0628;

public class BoardBit implements BoardImp{

  public static void main(String[] args) {
  }

  @Override //상속했을 때 자식이 재정의를 했다는 의미 (생략가능 -> 기술해서 상속과 비상속의 구분을 해주는게 더 좋음)
  public int boardCount() {
    return 0;
  }

  @Override
  public boolean boardInsert() {
    return false;
  }

  @Override
  public void boardDelete(int num) {

  }

  public void index() {
    //인터페이스에 소속되어있지 않음!! 상속X, 재정의대상X
    //@Override기술하면 에러
  }

} //class END
