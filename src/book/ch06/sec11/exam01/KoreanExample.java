package book.ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("030228-123456","이재현");
        System.out.println("k1.nation: "+k1.nation);
        System.out.println("k1.name: "+k1.name);
        System.out.println("k1.ssn: "+k1.ssn);

        k1.name= "이또치";
        System.out.println("k1.name: "+k1.name);
    }
}
