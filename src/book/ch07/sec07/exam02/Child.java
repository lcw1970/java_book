package book.ch07.sec07.exam02;

public class Child extends Parent{
    // 메소드 오버라이딩

    @Override
    public void method2(String message) {

        System.out.println("Child-method2()");
    }

    public void method3() {
        System.out.println("Child-method3()");
    }
}
