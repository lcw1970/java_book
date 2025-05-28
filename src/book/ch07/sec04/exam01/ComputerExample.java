package book.ch07.sec04.exam01;



public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Calculator cal = new Calculator();

        double result1 = cal.areaCircle(r);
        System.out.println("원 면적: " +result1);
        System.out.println();

        Computer com = new Computer();
        double result2 = com.areaCircle(r);
        System.out.println("원 면적: "+result2);
    }
}
