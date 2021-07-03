package net.hb.day0628;

class Car {
  static int carNumber = 0; // 메소드영역 
  String carName = ""; // 힙 영역 new로 생성시 매번 새롭게 힙에 생성됨
}

public class AAAAAA {
  @SuppressWarnings("static-access")
  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car();

    car1.carNumber = 1;

    System.out.println(car2.carNumber); // 1
    System.out.println(Car.carNumber); // 1

    Car.carNumber = 2;
    System.out.println(car2.carNumber); // 2
    System.out.println(car1.carNumber); // 2


    car1.carName = "볼보";
    car2.carName = "폭스바겐";

    System.out.println(car1.carName); // 2 볼보
    System.out.println(car2.carName); // 2 폭스바겐 < car2.carNumber 에서  car2.carName 으로 수정..
    //        System.out.println(Car.carName); // 에러!! 왜나하면 Car는 힙영역에 있는carName이 없기때문!!
  }

}