package book.ch06.sec08.exam01;



public class Calculator {

    void powerOn(){
        System.out.println("전원을 킵니다.");
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    int plus(int x,int y){
        return x+y;
    }
    double div(int x,int y){
        return (double) x /y;
    }
}
