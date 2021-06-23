package com.eomcs;

public class ArrayList {

  static final int MAX_LENGTH = 100;
  static Object[] list = new Object[MAX_LENGTH]; // 100개의 식판을 꼽을 운반기 준비
  static int size = 0;

  static void append(Object obj) {
    list[size++] = obj;
  }

  static Object[] toArray() {
    Object[] arr = new Object[size]; // 들어있는 사이즈 만큼만 배열 만ㄷ르어

    for (int i = 0; i < size; i++) {
      arr[i] = list[i];
    }

    return list;
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
