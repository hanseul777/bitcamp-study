package com.eomcs.lang.ex07;

//# 메서드 : 인스턴스와 Heap 메모리 영역
public class Exam0430 {

  //Heap 메모리에 어떤 변수를 만들어야 하는지 적어 놓은 설계도 : class
  static class MyObject {
    int a;
    int b;
  } // Exam0430.class에 포함되어 있는게 아님. 각각의 클래스파일이 만들어짐.
  // 중첩 클래스

  static MyObject getMyObject() {
    MyObject ref = new MyObject(); //new로 만든 변수는 Heap에 존재. 사라지지않는다. 
    ref.a = 100;
    ref.b = 200;

    return ref;
  }

  public static void main(String[] args) {
    MyObject ref;
    ref = getMyObject();
    System.out.println(ref.a);
    System.out.println(ref.b);
  }
}

// 1) main() 호출
//    => JVM Stack: args, ref 변수 생성
// 2) getMyObject() 호출
//    => JVM Stack: ref 변수 생성
//    => Method Area: MyObject 클래스를 로딩
//    => Heap: MyObject 설계도에 따라 인스턴스 생성
// 3) getMyObject() 호출 끝
//    => JVM Stack: getMyObject() 관련 메모리(ref 변수) 제거
//    => MyObject의 인스턴스의 주소 리턴
// 4) main() 호출 끝
//    => JVM Stack: main() 관련 메모리 제거 
// 5) JVM 종료
//    => JVM이 사용한 모든 메모리(Method Area, JVM Stack, Heap 등)를 OS 반납.