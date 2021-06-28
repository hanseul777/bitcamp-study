package net.hb.day0628;

import java.util.Scanner;

public class CampTest2 {
  Scanner sc=new Scanner(System.in);
  boolean[] camp = new boolean[5]; //배열선언되면 자동으로 false초기값 세팅
  int num=0;

  public static void main(String[] args) {
    CampTest2 guest = new CampTest2();
    System.out.println("함수응용 캠프배열");
    int sel = 9;
    guest.map();

    while(true) {
      try {
        sel=guest.menu();
        if(sel==9) {
          guest.myExit();
          break;
        }

        switch(sel) {
          case 1: //입실처리
            guest.input();
            guest.map();
            break;

          case 2: //퇴실은 조별/개인별처리
            guest.output();
            guest.map();
            break;  

          case 3: //전체예약상태
            guest.map();
            break;
          default: 
            System.out.println("1~3메뉴를 선택하셔야 합니다");
            break;  
        }//switch end
      }catch (Exception e) {  }
    }//while 

  }//end

  public int menu() {
    System.out.print("\n1.예약  2.퇴실  3.보기  9.종료 : ");
    int sel = Integer.parseInt(sc.nextLine());
    return sel;
  }

  public void input() {
    System.out.print("예약캠핑번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); //고객이 5입력
    if(num <1 || num >5) { System.out.println(num +"번호를 사용할수 없습니다"); }
    if(camp[num-1]==true) {
      System.out.println("이미 예약된 캠프장 사용할수 없습니다");
    }else {
      System.out.println("camp["+num+"] 캠프장 예약성공");
      camp[num-1]=true; //false대신 진짜true값대입
    }
  }

  public void output() {
    System.out.print("퇴실캠핑번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); //3입력하면 
    if(camp[num-1]==true) {
      System.out.println("camp["+num+"] 캠프장 퇴실성공했습니다");
      camp[num-1]=false; 
    }else {
      System.out.println("camp["+num+"] 비어있는 캠프장입니다");
    }

  }

  public void  printAll(  ) {

  }

  public void  myExit() {
    System.out.println("캠프장예약프로그램을 종료합니다");

  }

  public void map() {
    //캠핑장 예약상태확인 
    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    } //for end
  }
}//class END