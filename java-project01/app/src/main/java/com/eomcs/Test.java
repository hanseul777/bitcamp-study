package com.eomcs;

class A {}
class B {}
class C {}

public class Test {
  public static void main(String[] args) {
    A r1;
    B r2;
    C r3;

    r1 = new A(); //r1에 A인스턴스주소 저장
    //    r1 = new B(); //r1에는 A만 가능
    //    r1 = new C();

    //    r2 = new A();
    r2 = new B();
    //    r2 = new C():

    //    r3 = new A();
    //    r3 = new B();
    r3 = new C();

    Object obj;

    obj = new A();
    obj = new B();
    obj = new C(); // Object에는 한 번에 가능.

  }

}
