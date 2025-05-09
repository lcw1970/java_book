package book.ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        double area1 = myCal.areRectangle(5);
        System.out.println("가로,세로: "+5);
        System.out.println("정사각형 넓이: "+area1);

        double area2 = myCal.areRectangle(5,10);
        System.out.println("가로: "+5+", 세로: "+10);
        System.out.println("직사각형 넓이: "+area2);
    }
}
