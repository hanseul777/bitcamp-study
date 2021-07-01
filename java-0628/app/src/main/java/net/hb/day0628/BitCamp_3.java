package net.hb.day0628;

public class BitCamp_3 {
  public BitCamp_3() {} //기본생성자는 생략가능
  public BitCamp_3(String location) {} //
  public BitCamp_3(int floor) {} //int타입의 매개인자 있는 생성자
  public BitCamp_3(String location, int pos, String subject) {
    System.out.println(location + pos + subject);
  }
  //생성자에서 생성자를 호출
  //  public BitCamp_3() { this("종로점", 7, "python");}
  // -> 기본생성자에서 4번생성자를 호출한 것
  // => this()현재클래스 생성자접근

  public static void main(String[] args) {
    BitCamp_3 bc = new BitCamp_3("종로점", 7, "python"); // 매개인자를 가진 생성자 때문에 사용가능.
    bc.coffee();

  }// main END

  public void coffee() {
    System.out.println("coffee");
    this.cookie(); // this 생략가능
  }

  public void cookie() {
    System.out.println("cookie");
  }

}// class END
