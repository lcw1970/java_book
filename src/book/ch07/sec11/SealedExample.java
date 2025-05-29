package book.ch07.sec11;

public class SealedExample {
    public static void main(String[] args) {
        Person p = new Person();
        Employee e = new Employee();
        Manger m = new Manger();
        Director d = new Director();

        workMethod(p);
        workMethod(e);
        workMethod(m);
        workMethod(d);
    }
    public static void workMethod(Person person){
        person.work();
    }
}
