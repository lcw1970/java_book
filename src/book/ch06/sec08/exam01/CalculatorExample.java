package book.ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        myCal.powerOn();
        int result1 = myCal.plus(5,6);
        System.out.println("result1: "+result1);

        double result2 = myCal.divide(10,4);
        System.out.println("result2: "+result2);
        myCal.powerOff();
    }
}
