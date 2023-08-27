package chap01_01oopdesc.without_interface;

public class FakeMessageSender {
    public void send() {
        // 실제로는 발송 안 하고, 명목상 발송했다고 처리
        System.out.println("FakeMessageSender, 가상 메세지 발송");
    }
}
