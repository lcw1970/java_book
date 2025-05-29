package book.ch08.sec05;


public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);
    }
}
