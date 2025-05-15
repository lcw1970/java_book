package book.ch07.sec03.exam02;

public class SmartPhone extends Phone {
    String wifi;

    public SmartPhone(String model,String color,String wifi){
        super(model,color);
        this.model = model;
        this.color = color;
        this.wifi = wifi;
        System.out.println("SmartPhone(String model,String color,String wifi) 생성자 실행");
    }
}
