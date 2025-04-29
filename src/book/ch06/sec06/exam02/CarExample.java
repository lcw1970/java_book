package book.ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("자동차 브랜드: "+myCar.company);
        System.out.println("모델: "+myCar.model);
        System.out.println("색상: "+myCar.color);
        System.out.println("최고속도: "+myCar.maxSpeed);
        System.out.println("현재속도: "+myCar.speed);

        myCar.speed = 60;
        System.out.println("수정된 속도: "+myCar.speed);
    }
}
