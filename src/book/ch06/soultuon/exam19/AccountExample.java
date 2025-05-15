package book.ch06.soultuon.exam19;

import book.ch06.sec13.exam02.package1.A;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(10000);
        System.out.println("현재 잔고: "+account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고: "+account.getBalance());

        account.setBalance(20000000);
        System.out.println("현재 잔고: "+account.getBalance());

        account.setBalance(30000);
        System.out.println("현 잔고: "+account.getBalance());
    }
}
