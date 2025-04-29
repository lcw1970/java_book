package book.ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "그랜저";
        myCar.speed = 20;
        myCar.start = true;

        System.out.println("차량 모델: "+myCar.model);
        System.out.println("시동여부: "+myCar.start);
        System.out.println("현재 속도: "+myCar.speed);

    }
}
