package book.ch07.sec11;

public non-sealed class Manger extends Person{
    @Override
    public void work() {
        System.out.println("생산 관리를 합니다.");
    }
}
