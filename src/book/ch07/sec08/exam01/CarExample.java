package book.ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HaTire();
        myCar.run();

        myCar.tire = new KuTire();
        myCar.run();
    }
}
