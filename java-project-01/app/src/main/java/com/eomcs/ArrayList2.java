package com.eomcs;

public class ArrayList2 {

  static final int MAX_LENGTH = 100;
  static Object[] list = new Object[MAX_LENGTH]; //왜 Object? 어떤 인스턴스배열이라도 다 담을 수 있또록 하기 위해.
  static int size = 0;

  static void append(Object obj) {
    list[size++] = obj;
  }

  static Object[] toArray() {
    Object[] arr = new Object[size];
    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }
    return arr;
  }

  static Object retrieve(int index) {
    return list[index];
  }

  static void remove(int index) {
    for (int i = index; i < size - 1; i++) {
      list[i] = list[i + 1];
    }
    size--;
  }

}






