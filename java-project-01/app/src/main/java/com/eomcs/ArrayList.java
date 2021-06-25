package com.eomcs;

public class ArrayList { // 3번에 전체적 흐름보여주는거 참고하면 이해가 감.

  // 배열의 최대 크기를 지정하는 변수는 모든 인스턴스가 같다.
  // => 따라서 각 인스턴스 마다 이 변수를 가질 필요는 없다.
  // => 그러니 이 변수는 그냥 클래스 변수로 둔다.
  // => 보통 상수 변수(final 변수)는 클래스 변수(static 변수)로 선언한다.
  static final int MAX_LENGTH = 100;

  // 각 인스턴스 마다 개별적으로 관리해야 하는 변수는 인스턴스 변수로 선언한다.
  Object[] list = new Object[MAX_LENGTH]; //왜 Object? 어떤 인스턴스배열이라도 다 담을 수 있또록 하기 위해.
  int size = 0;

  // 메서드가 작업할 때 인스턴스 변수를 사용할 수 있또록 파라미터로 인스턴스 주소를 전달한다.

  // 인스턴스 변수(ex. List, size)를 사용하는 메서드는 인스턴스 메서드를 전환한다.
  // 인스턴스 메서드는 인스턴스 주소를 받는 this 이름의 레퍼런스가 컴파일시 자동으로 생성된다.
  void append(Object obj) { // append : static변수 list를 찾아가서 list배열에 찾아감.
    this.list[this.size++] = obj;
  }

  Object[] toArray(ArrayList this) {
    Object[] arr = new Object[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
  }

  Object retrieve(int index) {
    return this.list[index];
  }

  void remove(int index) {
    for (int i = index; i < this.size - 1; i++) {
      this.list[i] = this.list[i + 1];
    }
    this.size--;
  }

}






