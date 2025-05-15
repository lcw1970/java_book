package book.ch06.soultuon.exam20;

public class Account {
    private int balance;
    private String name;
    private String accountNumber;

    public Account(String accountNumber,String name,int balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(int amount){
        if (amount >0) {
            balance += amount;
        }
        else {
            return;
        }
    }
    public void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
        }
    }
    public void getinformation() {
        System.out.print(accountNumber+"\t"+name+"\t"+balance+"\n");
    }

    public String getAccount() {
        return accountNumber;
    }
}
