package book.ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv,String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트 티비");

        Product<Car,String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV자동차");
    }
}
