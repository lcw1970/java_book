package book.ch06.sec08.exam01;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        c1.powerOn();

        int result1 =c1.plus(5,7);
        System.out.println(result1);

        double result2 = c1.div(6,2);
        System.out.println(result2);

        c1.powerOff();
    }
}
