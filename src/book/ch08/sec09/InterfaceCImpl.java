package book.ch08.sec09;

public class InterfaceCImpl implements InterfaceC{

    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl.methodC");
    }

    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl.methodB");
    }
}
