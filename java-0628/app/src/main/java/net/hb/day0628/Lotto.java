package net.hb.day0628;

public class Lotto { //단독실행 불가 : main함수 없음

  public static int[] input() {
    int[] su = new int[6];
    su[0] = 5;  su[1] = 5;  su[2] = 7;
    su[3] = 2;  su[4] = 8;  su[5] = 3;
    return su;
  }

  public static void output(int[] LT) {
    for (int i =0; i<LT.length; i++) {
      System.out.print(LT[i] + " ");
    }
    System.out.println("\n 로또배열 출력 성공했습니다.");
  }

  public static int inputSum() {
    int sum = 0;
    int[] su = new int[6];
    su[0] = 5;  su[1] = 5;  su[2] = 7;
    su[3] = 2;  su[4] = 8;  su[5] = 3;

    for (int i = 0; i<su.length; i++) {
      sum += su[i];
    }
    System.out.println(sum);
    return sum;
  }


} // class END
