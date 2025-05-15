package book.ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone iPhone = new SmartPhone("아이폰","미드나이트");

        // Phone으로부터 상속받은 필드 읽기
        System.out.println("모델 : "+iPhone.model);
        System.out.println("색상 : "+iPhone.color);

        System.out.println("와이파이 상태: "+ iPhone.wifi);

        //Phonem으로부터 상속받은 메소드 호출
        iPhone.setWifi(true);
        System.out.println("와이파이 상태: "+ iPhone.wifi);
        iPhone.internet();

        iPhone.bell();

        iPhone.sendVoice("여보세요");
        iPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        iPhone.sendVoice("아~ 네 반갑습니다.");

        iPhone.hangUp();

    }
}
