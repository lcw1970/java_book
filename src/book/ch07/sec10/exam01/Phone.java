package book.ch07.sec10.exam01;

public abstract class Phone {
    String owner;

    public Phone(String owner){
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("폰 전원을 킵니다.");
    }
    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
