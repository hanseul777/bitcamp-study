package net.hb.day0628;

public interface BoardImp {
  //메소드 선언만 하는 것 = abstract method = 추상메소드
  // -> 명세서의 역할 (메모장같은느낌)
  //abstract키워드 생략가능 -> 기술해도 에러없음
  public abstract int boardCount() ;
  public abstract boolean boardInsert(); 
  public void boardDelete(int num);

}//interface END
