package book.ch06.sec09;

public class Car {
    // 인스턴스 필드 선언
    String model;
    int speed;

    // 생성자 선언
    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    void run() {
        setSpeed(100);
        System.out.println(this.model+"가 달립니다.(시속: "+speed+"km/h)");
    }
}
