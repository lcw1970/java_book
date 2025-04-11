package book.ch05;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        // intArray[0] =10; // NullPointerException
        // 배열이 참조할 곳이 없기때문

        String str =null;
        //System.out.println("총 문자 수: "+str.length());
    }
}
