package net.hb.day0628;

public class Work01jumin {

  public static void main(String[] args) {
    String min = "980126-2541965"; // 키보드입력대신 초기값으로.
    String min1 = "980126";
    String min2 = "1541965";

    //문제1  총자릿수 6자리 - 7자리 (13자릿수 or 14자릿수)
    //문제2  ****** - 1541965
    //문제3  2/4 여자  1/3 남자  switch문 사용
    //length(),substring(),indexOf(),charAt() 사용하기

    // Q.1
    int len = min.length();
    int len1 = min1.length();
    int len2 = min2.length();
    System.out.println(len);
    System.out.println(len1);
    System.out.println(len2);

    System.out.println();

    if(len1 != 6) {
      System.out.println(min2);
    } else {
      System.out.println(min1);
    }

    System.out.println();

    //Q.2
    String data = min.substring(min.indexOf("-") + 1); // 메소드를 중첩해서 사용 가능.
    System.out.println("****** - " + data);

    String data2 = min2.substring(0);
    System.out.println("****** - " + data2);

    System.out.println();

    //Q.3

    String msg = "성별구별";
    char gender = min.charAt(7);
    switch (gender) {
      case '1':
      case '3': 
        msg = "남자입니다."; break;
      case '2':
      case '4':
        msg = "여자입니다."; break;
      default :
        msg = "성별을 잘 못 기술하셨습니다"; break;
    }

    System.out.println(msg);

  }
}// end
