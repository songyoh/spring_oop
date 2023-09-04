package chap04_06proxy;

public class Proxy implements SomeInterface{

    // 대리자 객체는 본체의 기능을 호출해주면서 + 본인의 실행 메서드를 추가해야 한다.
    private Service service;

    public Proxy() { // 대리객체 생성시 본체타입인 service가 자동으로 주입되도록 한다.
        this.service = new Service();
    }
    @Override
    public void someMethod() {
        // 본체 위임 메서드 실행 전
        System.out.println("대리자 객체가 본체 메서드 호출 전에 사전 실행 코드를 수행한다.");

        // 본체로부터 호출 위임(delegate)관계 상속을 받은건 아님(부모, 자식관계가 아님)
        service.someMethod();

        // 본체 위임 메서드 실행 후
        System.out.println("대리자 객체가 본체 메서드 호출 후에 사후 실행 코드를 수행합니다.");
    }
}
