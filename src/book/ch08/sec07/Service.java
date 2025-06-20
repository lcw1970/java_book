package book.ch08.sec07;

public interface Service {
    // 디폴드 메소드
    default void defaultMethod1() {
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();
    }
    default void defaultMethod2() {
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon() {
        System.out.println("defaultMethod 중복코드 A");
        System.out.println("defaultMethod 중복코드 B");
    }

    static void staticMethod1() {
        System.out.println("Service.staticMethod1");
    }

    static void staticMethod2() {
        System.out.println("Service.staticMethod2");
    }

    private static void staticCommon() {
        System.out.println("staticMethod 중복 코드C");
        System.out.println("staticMethod 중복 코드D");
    }
}
