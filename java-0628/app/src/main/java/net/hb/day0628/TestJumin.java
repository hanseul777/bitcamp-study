package net.hb.day0628;

public class TestJumin {

  public static void main(String[] args) {

    //java.lang패키지 String클래스의 메소드 char charAt(int)
    //String클래스의 메소드 int indexOf(int/String)
    //String클래스의 메소드 String substring(1시작,2끝-1)
    //String클래스의 메소드 String substring(1시작) 시작부터 끝까지

    String min = "980126-1541965";
    String month = min.substring(2,4);
    String day = min.substring(4,6);

    System.out.println(month + "월" + day + "일 생일이네요");

    String last = min.substring(7);
    System.out.println(last);

    int len = min.length();
    System.out.println(len);


  }

} // TestJumin class END

/*char gender = min.charAt(7);
String message = "당신의 성별을 출력합니다.";

//    if (min.charAt(7) == '1') {
if (gender == '1') {
  message = "남자입니다.";
} else if (gender == '2') {
  message = "여자입니다.";
} else {
  message = "성별이 잘 못 표기 되었습니다.";
}
System.out.println(message);*/


/*int pos = min.indexOf("-"); //-의 위치 출력 : 6
    System.out.println("pos = " + pos); */