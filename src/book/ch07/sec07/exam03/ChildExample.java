package book.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child(15);

        parent.name = "이또치";
        parent.method1();
        parent.method2();

        Child child = (Child) parent;

        child.age = 15;

    }
}
