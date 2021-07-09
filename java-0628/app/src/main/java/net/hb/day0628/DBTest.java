package net.hb.day0628;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest {

  Connection CN = null; //DB서버연결정보 : ip주소, 계정id와 pw 등 기억
  Statement ST = null; //명령어 생성 : 삭제, 신규등록, 조회 등 명령내림
  ResultSet RS = null; //Select조회결과값 전체데이터를 
  String msg = "isud = crud 쿼리기술문";    
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    DBTest DB = new DBTest();

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클드라이브로드
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
      DB.CN = DriverManager.getConnection(url, "system", "1234");

      //첫 번째 명령어 생성
      DB.ST = DB.CN.createStatement();

      loop: while (true) {
        System.out.println("메뉴선택");
        System.out.println("1. 코드입력");
        System.out.println("2. 코드출력");
        System.out.println("3. 코드삭제");
        System.out.print("메뉴를 선택 (1..3) (0입력시 종료): ");
        String s = DB.sc.nextLine();
        switch (s) {
          case "1" : DB.input(); break;
          case "2" : DB.output(); break;
          case "3" : DB.dbDelete(); break;
          case "0" : break loop;
        }

      }

    }catch (Exception ex) {System.out.println("에러이유" + ex);}
    DB.sc.close();

  }//main close

  public void input() {
    try {
      //키보드에서 데이터 입력
      System.out.print("\n코드입력(4자릿수) : ");
      int a = Integer.parseInt(sc.nextLine());
      System.out.print("이름입력 : ");
      String b = sc.nextLine();
      System.out.print("제목입력 : ");
      String c = sc.nextLine();

      //3번째 쿼리문 완성
      //      msg = "insert into test (code,name,wdate,cnt) values(a,'b', 'c', sysdate, 0)";
      msg="insert into test(code,name,title,wdate,cnt) values("+a+", '"+b+"', '"+c+"', sysdate, 0)";
      System.out.println(msg);

      //4번째 서버에서 실행 executeUpdate("insert ~~")
      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(a + "코드 데이터 저장성공했습니다.");
      } else {System.out.println(a + "코드 데이터 저장실패했습니다.");}

    }catch (Exception e) {System.out.println("에러이유 : "+ e);}
  }

  public void output() {
    try {
      System.out.println("프로그램 전체데이터 읽어오는 중... 잠시 기다려 주세요.");
      Thread.sleep(3000);
      msg = "select * from test" ; //문자열을 명령어 인식해서 실행하도록 Statement
      RS = ST.executeQuery(msg);

      System.out.println("코드\t이름\t");
      while(RS.next()==true) {
        //필드접근해서 데이터가져올 때 getXXX()
        int ucode = RS.getInt("code");
        String uname = RS.getString("name");
        System.out.println((ucode + "\t" + uname));
      }
    }catch (Exception e) {System.out.println("에러이유 : "+ e);}
  }

  public void dbDelete() {
    try {
      System.out.print("삭제할 이름 입력 : ");
      String del = sc.nextLine();
      msg = "delete from test where name = " + del + "'";
      System.out.println(msg);
      int OK = ST.executeUpdate(msg);
      if (OK>0){
        System.out.println(del+"데이터 삭제 성공");   
      }else {System.out.println(del+"데이터 삭제 실패");}

    }catch (Exception e) {System.out.println("에러이유 : "+ e);}
  }


}//class close