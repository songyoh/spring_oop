package chap01_01oopdesc.with_interface;

public class FakeMessageSender implements MessageSender{

    @Override
    public void send() {
        System.out.println("FakeMessageSender, 가상 메세지(전송X)");
    }
}
