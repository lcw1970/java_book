package pratice;

public class Cal {
    String color;
    String brand;

    void setColor(String color){
        this.color = color;
    }

    void setBrand(String brand){
        this.brand = brand;
    }

    int plus(int x,int y){
        return CalUtill.plus(x,y);
    }
    int minus(int x,int y){
        return CalUtill.minus(x,y);
    }
}
