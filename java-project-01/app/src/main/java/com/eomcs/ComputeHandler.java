package com.eomcs;

import java.util.Scanner;

public class ComputeHandler implements Handler{
  static Scanner keyScan;

  public void execute() { //static이 없으면 메소드명으로 호출이 불가능 함. -> 인스턴스를 만들어 줘야 함.
    while (true) {
      System.out.print("계산식: (이전 메뉴: back) (예: 100 * 4) ");
      String expression = keyScan.nextLine();

      if (expression.equals("back")) { //문자를 같냐고 물어볼 때는 메서드를 이용해야함 : .equals
        break;
      }

      String [] arr = expression.split(" "); //배열에 담아서 공백에서 잘라주는 것. pdf 3번의 p.2
      if (arr.length != 3) {
        System.out.println("계산식의 입력이 잘못되었습니다.");
        continue;
      }

      int a = Integer.parseInt(arr[0]);
      int b = Integer.parseInt(arr[2]);

      switch (arr[1]) {
        case "+":
          System.out.printf("%d + %d = %d\n", a, b, a + b);
          break;
        case "-":
          System.out.printf("%d - %d = %d\n", a, b, a - b);
          break;
        case "*":
          System.out.printf("%d * %d = %d\n", a, b, a * b);
          break;
        case "/":
          System.out.printf("%d / %d = %d\n", a, b, a / b);
          break;
        case "%":
          System.out.printf("%d %% %d = %d\n", a, b, a % b);
          break;
        default:
          System.out.println("이 연산은 지원하지 않습니다.");
      }
    }
  }
}
