package pratice;

public class CalMain {
    public static void main(String[] args) {
        Cal myCal = new Cal();
        myCal.setColor("검정");
        myCal.setBrand("카시오");

        int result1 = myCal.plus(5,10);
        System.out.println(result1);
        int result2 = myCal.minus(10,5);
        System.out.println(result2);
    }
}
