package book.ch07.sec04.exam02;

public class SupersonicAirplane extends AirPlane{
    // 상수 선언
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    // 필드 선언
    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        }
        else {
            super.fly();
        }
    }
}
