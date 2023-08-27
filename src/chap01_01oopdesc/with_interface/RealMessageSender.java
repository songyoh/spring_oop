package chap01_01oopdesc.with_interface;

public class RealMessageSender implements MessageSender{

    @Override
    public void send() {
        System.out.println("RealMessageSender, 실제 발송될 메세지");
    }
}
