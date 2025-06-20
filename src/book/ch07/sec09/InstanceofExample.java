package book.ch07.sec09;

public class InstanceofExample {
    public static void personInfo(Person person){
        System.out.println("name: "+person.name);


        if (person instanceof Student student){
            System.out.println("StudentNo: "+student.studentNo);
            student.study();
        }
        else{
            person.walk();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        Person p2 = new Student("김길동",10);
        personInfo(p2);
    }
}
