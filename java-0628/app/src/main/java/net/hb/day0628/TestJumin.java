package net.hb.day0628;

public class TestJumin {

  public static void main(String[] args) {
    //java.lang패키지 String클래스의 메소드 char charAt(int)
    String min = "971024-2541965";

    // 조건if 남자입니다 || 여자입니다
    // String문자열은 0번째부터 시작
    if (min.charAt(7) == '1') {
      System.out.println("남자입니다.");
    } else if (min.charAt(7) == '2') {
      System.out.println("여자입니다");
    } else {
      System.out.println("유효하지 않습니다.");
    }
  }

} // TestJumin class END
