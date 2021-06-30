package net.hb.day0628;

import java.io.InputStream;
import java.util.Scanner;

public class Work02emp2 {

  public static void main(String[] args) {
    //java.util패키지 Scanner생성자3번째 (InputStream)
    InputStream is  = System.in;
    Scanner sc = new Scanner(is);
    int sabun = 0;
    String name;

    //문제 키보드입력 Scanner클래스 반드시 입력해서 출력, 반복문, 예외처리, 형변환

    /*while(true) {
      try {
        System.out.print("사번입력 : ");
        sabun = Integer.parseInt(new Scanner(System.in)nextLine()); // 사번에 문자를 입력시 catch로 빠져버림. -> 예외처리문 때문에
        System.out.print("이름입력 : ");
        name = sc.nextLine();
        if (name.equals("") || name.equals(null)) {
          System.out.println("이름데이터 정확히 입력하세요");
          continue;          
        }
        break;
      }catch (Exception e) {}
    }//while end  */



    System.out.println();
    System.out.println("사번 = " + sabun);
    System.out.println("이름 = " + name);

  }// end
}// class END
