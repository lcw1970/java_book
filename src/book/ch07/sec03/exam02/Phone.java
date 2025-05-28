package book.ch07.sec03.exam02;

public class Phone {
    // 필드 선언
    public String model;
    public String color;

    public Phone(String model,String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone(String color,String model) 생성자 실행");
    }

}
