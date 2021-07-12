package net.hb.day0628;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBBoard { //test테이블
  Connection CN=null; //DB서버연결정보 서버ip주소 계정id,pwd
  Statement ST=null;  //ST=CN.createStatement()명령어생성 삭제,신규등록,조회하라
  ResultSet RS=null;  //select조회결과값 전체데이터를 기억합니다
  String msg="";
  int Gtotal = 0;  
  Scanner sc = new Scanner(System.in);
  //CN,ST,RS,msg,Gtotal,sc 전역변수는 main에서 사용불가 

  public void dbConnect() {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클드라이브로드
      CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
      System.out.println("07-09-금요일 오라클 드라이브및 서버연결성공 ");     
      ST = CN.createStatement(); //반드시필수 
    }catch(Exception ex){System.out.println("error =" + ex);}
  }//end

  public void dbInsert() {
    try {

    }catch(Exception ex) { }   
  }//end

  public void dbSelectAll() {
    try {
      ST = CN.createStatement();
      msg ="select  * from  test  order by code "; //문자열을 명령어처리 
      ResultSet rs = ST.executeQuery(msg);
      while(rs.next()==true) {
        int a = rs.getInt("code");
        String b = rs.getString("name");
        String c = rs.getString("title");
        System.out.println(a+"\t"+b+"\t" +c);
      }
      rs.close();
    }catch(Exception ex){System.out.println("전체조회실패 =" + ex); }    
  }//end

  public void dbDelete() {
    try {
      //삭제처리는 삭제대상 필드를 정하기
      //삭제처리는 99% where 조건절
      System.out.print("삭제이름 입력>>> ");
      String del = sc.nextLine(); //sc.next() : 공백주면 분리  sc.nextLine() : 엔터까지 입력 
      msg = "delete from test where name = '" + del +"' ";
      System.out.println(msg);
      ST = CN.createStatement();
      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(del + "데이터 삭제성공");
        dbSelectAll();
      }else {
        System.out.println(del + "데이터 삭제실패");
      }

      //msg문자열을 sql명령어 인식 : Statement
      String msg1 = "insert into ~~ ";
      String msg2 = "delete where ~~ ";
      String msg3 = "update T명 set where ~~ ";
      String msg4 = "select ~~ "; 
      //       msg1, msg2, msg3 처리는 ST.executeUdate(쿼리문장)
      //msg4 처리는 ST.executeQuery(쿼리문장)
    }catch(Exception ex) { }      
  }//end

  public static void main(String[] args) {//메인메소드는 메모리에 자동로드=실행
    try { 
      DBBoard bbs = new DBBoard();
      bbs.dbConnect(); //생략하면 문법에러 없습니다
      bbs.dbSelectAll();
      bbs.dbDelete();
      bbs.dbEdit();

    }catch(Exception ex){ }
  }//end

  public void dbEdit() {
    try {
      //수정처리는 대상 필드 name,title
      System.out.print("수정code 입력>>> ");
      String ecode = sc.nextLine();
      System.out.print("수정name 입력>>> ");
      String ename = sc.nextLine();
      System.out.print("수정title 입력>>> ");
      String etitle = sc.nextLine();
      msg = "update test set name = 'ename', title = 'etitle' where code = 'ecode' ";
      System.out.println(msg);
      ST = CN.createStatement();
      int OK = ST.executeUpdate(msg);
      if (OK>0) {System.out.println(ecode + "데이터 수정성공");}
      else {System.out.println(ecode + "데이터 수정실패");}
      dbSelectAll();      
    }catch(Exception ex){} 
  }
}//Board class END