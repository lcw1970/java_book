package book.ch07.sec05.exam02;

public class SportsCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }

    //public void stop() { final은 오버라이딩 할 수 없다.
    //    System.out.println("스포츠카를 멈춤");
    //    speed = 0;
    //}
}
