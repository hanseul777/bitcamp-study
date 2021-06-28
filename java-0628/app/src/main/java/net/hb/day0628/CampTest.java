package net.hb.day0628;

import java.util.Scanner;


public class CampTest {

  public static void main(String[] args) {
    System.out.println("1차원배열 캠프예매 28일 월요일 ");
    Scanner sc=new Scanner(System.in);
    boolean[] camp = new boolean[5]; // 0번째 1번째 2번째 3번째 4번째
    int sel=9, num=0;

    //캠핑장 예약상태확인 
    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    } //for end

    while(true) {
      try {
        System.out.print("\n1.예약  2.퇴실  3.보기  9.종료 : ");
        sel = Integer.parseInt(sc.nextLine());

        if(sel==9) {
          System.out.println("캠프장예약프로그램을 종료합니디");
          break;
        }

        switch(sel) {
          case 1: 
            System.out.print("예약캠핑번호 입력>>> ");
            num=Integer.parseInt(sc.nextLine()); //고객이 5입력
            if(num <1 || num >5) { System.out.println(num +"번호를 사용할수 없습니다"); }


          case 2: //퇴실은 조별/개인별처리
            System.out.print("퇴실캠핑번호 입력>>> ");
            num=Integer.parseInt(sc.nextLine()); //3입력하면 

            break;   
          case 3: //전체예약상태
            for(int i=0; i<camp.length; i++) {
              if(camp[i]==true) {
                System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
              }else {
                System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
              }
            } //for end
            break;
          default: 
            System.out.println("1~3메뉴를 선택하셔야 합니다");
            break;   
        }//switch end
      }catch (Exception e) {   }
    }//while 

    sc.close();
  }//end
}//class END
