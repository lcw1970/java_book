package book.ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean[] array = new Korean[3];

        Korean k1 = new Korean("이재현","1234",23);
        array[0] = k1;

        Korean k2 = new Korean("정은비","1234",23);
        array[1] = k2;

        Korean k3 = new Korean("이기준","1234",15);
        array[2] = k3;
        for (Korean korean : array) {
            PrintInformation(korean);
        }
    }
    static void PrintInformation(Korean korea){
        System.out.println("-------정보출력-------");
        System.out.println("국가: "+korea.nation);
        System.out.println("이름: "+korea.name);
        System.out.println("주민번호: "+korea.ssn);
        System.out.println("나이: "+korea.age);
    }
}
