package net.hb.day0628;

public class SJ { //make공급처

  // 합계구하는 함수
  // 평균구하는 함수
  // 학점구하는 함수
  // 합격여부를 구하는 함수

  public int getTotal(String name, int first, int second) {
    System.out.println(name + "님의 성적합계처리");
    int sum = first + second;
    System.out.println(sum);
    return sum; //retrun값의 형에 따라 void자리에 넣는다.
  }

  public double getMean(int value) {
    double dd = value/2.0;
    return dd;
  }

  public char getGrade(double avg) {
    char grade = 'F';

    switch ((int)avg/10) { //평균데이터점수 정수화
      case 10 :
      case 9 :  grade = 'A'; break;
      case 8 :  grade = 'B'; break;
      case 7 :  grade = 'C'; break;
      case 6 :  grade = 'D'; break;
      default : 
        grade = 'F'; break;
    }
    return grade;
  }

  public String result(double avg) { //함수의 중복 = OverLoading
    String msg = "합격여부안내문";
    if (avg >= 70) {
      msg = "축합격";
    } else  {
      msg = "재시험";
    }
    return msg;
  }

  public String result(double avg, int first, int second) {
    String msg = "합격여부안내문";
    if (avg >= 70 && first >= 60 && second >= 60) {
      msg = "축합격";
    } else  {
      msg = "재시험";
    }
    return msg;
  }


} //SJclass END