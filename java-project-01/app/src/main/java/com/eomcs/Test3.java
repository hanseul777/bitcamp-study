package com.eomcs;

class Calculator3 {
  int result;

  // non-static 메서드 = 인스턴스 메서드
  // => 인스턴스 주소를 받는 'this' 라는 이름의 변수가 내장되어 있다.
  // => 따라서 개발자가 인스턴스 주소를 받는 변수를 파라미터로 선언할 필요가 없다.
  void plus (/*Calculator3 this,*/int value) { 
    this.result += value; //result += value; 라고 쓰면 this를 생략한 것.(컴파일러가 자동으로 생성) 
  }
}

public class Test3 {
  public static void main(String[] args) {
    Calculator3 obj1 = new Calculator3(); //인스턴스변수를 사용하려면 꼭 new가 필요함.
    Calculator3 obj2 = new Calculator3();

    // 인스턴스메서드를 호출할 때 
    // 반드시 앞에 준 인스턴스 주소를 제공해야 한다.
    // 그 인스턴스 주소는 메서드에 내장된 this 라는 변수에 전달된다.    
    obj1.plus(100); //obj1 : 주소값  
    obj1.plus(200);
    obj1.plus(300);

    obj2.plus(111);
    obj2.plus(222);

    System.out.println(obj1.result);
    System.out.println(obj2.result);

  }
}






