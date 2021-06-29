package net.hb.day0628;

public class SJUser { // use 소비자
  public static void main(String[] args) {

    SJ sj = new SJ();

    String id = "한슬";
    //    int [] num = new int [] {90,85};
    int first = 100;
    int second = 50;
    int total = sj.getTotal(id, first, second); // sum과 total처럼 이름이 달라도 상관없다.
    double avg = sj.getMean(total);
    char grade = sj.getGrade(avg);
    //합격조건 평균이 70점부터, 각과목별 60점부터
    // 함수의 중복 = 오버로딩 = overLoading
    String info = sj.result(avg, first, second);

    System.out.println("합계 = " + total);
    System.out.println("평균 = " + avg);
    System.out.println("학점 = " + grade);
    System.out.println("결과 = " + info);


  }
}// class END
