package com.eomcs;

class Calculator1 {
  static int result; // static변수 - ArrayList를 두개만들어서 했던 방법에서 쓰던거

  static void plus (int value) {
    Calculator1.result += value; //static변수는 클래스이름으로 직접접근이 가능
  }
}

public class Test {
  public static void main(String[] args) {
    Calculator1.plus(100);
    Calculator1.plus(200);
    Calculator1.plus(300);
    System.out.println(Calculator1.result);

  }
}






