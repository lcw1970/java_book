package book.ch07.sec07.exam03;

public class Child extends Parent {
    int age;
    public Child(int age){
        super("이재현");
        this.age = age;
    }
    public void method3() {
        System.out.println("Child-method3()");
    }
}
