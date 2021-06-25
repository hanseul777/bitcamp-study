package com.eomcs;

class Calculator2 {
  int result;//인스턴스변수 -> Calculator2 클래스에서 result라는 인스턴스를 만든다.

  static void plus (Calculator2 c, int value) { //인스턴스변수는 주소값을 알아야 클래스에 접근이 가능.
    c.result += value;  
    // c에들어있는 주소값(c => obj1이나 obj2) 을 찾아가서 result라는 변수에 기존값(value)를 더해라.
  }
}

public class Test2 {
  public static void main(String[] args) {
    Calculator2 obj1 = new Calculator2(); //인스턴스변수를 사용하려면 꼭 new가 필요함.
    Calculator2 obj2 = new Calculator2();

    Calculator2.plus(obj1, 100); //obj1 : 주소값  
    Calculator2.plus(obj1, 200);
    Calculator2.plus(obj1, 300);

    Calculator2.plus(obj2, 111);
    Calculator2.plus(obj2, 222);

    System.out.println(obj1.result);
    System.out.println(obj2.result);

  }
}






