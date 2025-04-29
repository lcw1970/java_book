package cal;

import java.util.Scanner;

public class CalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cal mycal = new Cal();

        double result = 0;

        mycal.powerOn();
        System.out.print("첫번째 숫자를 입력하세요: ");
        int x = sc.nextInt();
        if (x == 0){
            mycal.powerOff();
        }
        System.out.print("두번째 숫자를 입력하세요: ");
        int y = sc.nextInt();

        sc.nextLine();
        System.out.print("+ - x %: ");
        String word1= sc.nextLine();

        result =select(mycal,word1,x,y);
        System.out.println(result);

        while (true){
            System.out.print("+ - x % (종료는 off입력): ");
            String word2= sc.nextLine();
            if (word2.equals("off")) {
                mycal.powerOff();
                break;
            }
            System.out.print("숫자를 입력해주세요: ");
            int z = sc.nextInt();
            result =select(mycal,word2,result,z);
            System.out.println(result);
            sc.nextLine();
        }


        }
    static double select(Cal cal,String word,double x,int y){
        double result= 0;
        if (word.equals("+")){
            result = cal.add(x,y);
        }
        else if (word.equals("-")){
            result = cal.sub(x,y);
        }
        else if (word.equals("x")){
            result =cal.mul(x,y);
        }
        else if (word.equals("%")){
            result =cal.div(x,y);
        }
        else {
            System.out.println("잘못된 문구를 입력하셨습니다.");
        }
        return result;
    }

    }





