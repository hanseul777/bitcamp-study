package net.hb.day0628;

import java.util.Scanner;

public class TestException {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dan = 1;// 변수초기화

    System.out.print("원하는 단 입력 >>>  ");
    //    int dan = sc.nextInt(); // 이렇게 하면 int값이 아닌 다른값을 넣으면 밑에 것도 출력할 수 없음
    try {
      dan = sc.nextInt();
      for (int i=1; i<10; i++) {
        System.out.println(dan+"*"+i+"="+(dan*i));
      }
    }catch(Exception ex) {} // 오류값을 입력해도 밑에 값은 정상출력. try - catch는 빼고 나머지는 정상이면 출력

    System.out.println();
    System.out.println("우리나라");
    System.out.println("대한민국");
    System.out.println("금수강산");
  }

}//TestException class END
