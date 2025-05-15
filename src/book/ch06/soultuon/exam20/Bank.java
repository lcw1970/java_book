package book.ch06.soultuon.exam20;


import java.util.Scanner;

public class Bank {

    private Account[] accounts = new Account[100];
    private int count = 0;

    public void createAccount(Scanner sc){
        if (count < 99) {
            System.out.println("---------");
            System.out.println("계좌생성");
            System.out.println("---------");

            System.out.print("계좌번호: ");
            String accountNumber = sc.nextLine();

            System.out.print("계좌주: ");
            String name = sc.nextLine();

            System.out.print("초기입금액: ");
            int firstMoney = sc.nextInt();
            sc.nextLine();
            Account account = new Account(accountNumber,name,firstMoney);
            accounts[count] = account;
            count += 1;
            System.out.println("결과: 계좌가 생성되었습니다.");
        }
        else {
            System.out.println("결과: 계좌가 생성불가합니다.");
        }
    }
    public void accountList(){
        System.out.println("--------");
        System.out.println("계좌목록");
        System.out.println("--------");
        for (int i = 0; i < count; i++) {
            accounts[i].getinformation();
        }
    }
    public void deposit(Scanner sc) {
        System.out.println("--------");
        System.out.println("예금");
        System.out.println("--------");
        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();
        System.out.print("예금액: ");
        int money = sc.nextInt();
        sc.nextLine();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if(accountNum.equals(accounts[i].getAccount())){
                accounts[i].deposit(money);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("혜당 계좌가 존재하지 않습니다.");
        }
    }

    public void withdraw(Scanner sc){
        System.out.println("--------");
        System.out.println("출금");
        System.out.println("--------");
        String accountNum = sc.nextLine();
        System.out.print("출금액: ");
        int money = sc.nextInt();
        sc.nextLine();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if(accountNum.equals(accounts[i].getAccount())){
                accounts[i].withdraw(money);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("혜당 계좌가 존재하지 않습니다.");
        }
    }
}
