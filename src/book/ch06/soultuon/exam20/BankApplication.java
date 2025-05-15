package book.ch06.soultuon.exam20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank();
        while(true){
            System.out.println("---------------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료 ");
            System.out.println("---------------------------------------");
            System.out.print("선택> ");
            int select = sc.nextInt();
            sc.nextLine();

            if (select == 5){
                System.out.println("프로그램 종료");
                break;
            }
            else if(select == 1){
                bank.createAccount(sc);
            }

            else if(select == 2) {
                bank.accountList();
            }

            else if(select == 3){
                bank.deposit(sc);
            }

            else if(select == 4){
                bank.withdraw(sc);
            }
        }
    }
}
