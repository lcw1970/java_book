package book.ch07.sec09;

public class Person {
    // 필드 선언
    public String name;

    public Person(String name){
        this.name =name;
    }

    public void walk() {
        System.out.println("걷습니다.");
    }
}
