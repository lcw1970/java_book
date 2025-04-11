package book.ch05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        String board = "번호,제목,내용,성명";
        String[] arr = board.split(",");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
