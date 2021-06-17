package com.eomcs.lang.ex06;

public class Test01 { // 알고리즘 만들기의 예시

  static int countEvenNumbers(int value) {
    int count = 0;

    // 이 메서드는 파라미터(value)로 주어진 값을 분석하여
    // 짝수 개수를 리턴하는 메서드이다.
    // 코드를 완성하시오!
    // 예) value = 4567034 --> 리턴 값 = 4
    // 예) value = 8188754 --> 리턴 값 = 3

    int n = value;
    while (n != 0) {
      if ((n % 2) == 0)
        count++;
      n /= 10;
    }

    return count;
  }

  public static void main(String[] args) {

    int result = countEvenNumbers(4567034);
    System.out.println(result); //4

    result = countEvenNumbers(8188753);
    System.out.println(result); //3
  }
}
