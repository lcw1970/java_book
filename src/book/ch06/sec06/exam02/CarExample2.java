package book.ch06.sec06.exam02;

public class CarExample2 {
    public static void main(String[] args) {
        Car mycar = new Car();
        System.out.println("브랜드: "+mycar.company);
        System.out.println("색상: "+mycar.color);
        System.out.println("최고속도: "+mycar.maxSpeed);
        System.out.println("현재속도: "+mycar.speed);

        mycar.speed = 60;
        System.out.println("수정된 속도: "+mycar.speed);
    }
}
