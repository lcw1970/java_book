package book.ch06.sec07.exam04;

public class Car {
    String company = "현대";
    String model;
    String color;
    int maxSpeed;

    Car() {}

    Car(String model){
        this(model,"은색",250);
    }
    Car(String model,String color){
        this(model,color,250);
    }
    Car(String model,String color,int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
