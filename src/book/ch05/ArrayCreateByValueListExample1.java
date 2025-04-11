package book.ch05;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring","Summer","Fall","Winter"};

        for (String s : season) {
            System.out.println("season[0] : "+s);
        }
        season[1] = "여름";
        System.out.println("season[1] : "+season[1]);
        System.out.println();

        int[] scores = {83,90,87};
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("총합 : "+sum);
        double ave = (double) sum / scores.length;
        System.out.println("평균 : "+ave);
     }
}
