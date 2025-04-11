package cal;

public class Cal {

    void powerOn(){
        System.out.println("계산기 실행 (종료 0)");
    }

    void powerOff(){
        System.out.println("계산기 종료");
    }

    int add(int x,int y){
        return x+y;
    }
    double add(double x,int y){
        return x + y;
    }

    int sub(int x,int y){
        return x-y;
    }
    double sub(double x,int y){
        return x-y;
    }

    int mul(int x,int y){
        return x*y;
    }
    double mul(double x,int y){
        return x*y;
    }

    double div(int x,int y){
        return (double)x/y;
    }
    double div(double x,int y) {
        return x / y;
    }

}
