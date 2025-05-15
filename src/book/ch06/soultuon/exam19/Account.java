package book.ch06.soultuon.exam19;

public class Account {
    private int balance;
    static int MIN_BALANCE = 0;
    static int MAX_BALANCE = 1000000;

    public void setBalance(int balance){
        if (MIN_BALANCE<=balance && balance<=MAX_BALANCE){
            this.balance = balance;
        }
        else {
            return;
        }
    }
    public int getBalance(){
        return balance;
    }
}
