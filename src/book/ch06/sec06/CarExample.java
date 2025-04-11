package book.ch06.sec06;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car("그랜저",true,60);

        carprint(car);
    }
    public static void carprint(Car car){
        System.out.println("모델명: "+car.model);
        System.out.println("시동여부: "+car.start);
        System.out.println("현재속도: "+car.speed);
    }
}
