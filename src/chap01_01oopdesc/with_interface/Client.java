package chap01_01oopdesc.with_interface;

public class Client {
    public void someMethod() {
        // 서비스에 필요한 코드 실행
        // 코드들

        // 메세지 발송을 객체 생성 및 발송메서드 호출
        // 추상계층으로 인터페이스가 생겼기에 고칠 부분이 한 군데로 줄어듬
        MessageSender messageSender = new FakeMessageSender();
        messageSender.send();
    }
}
