package chap01_02inheritance.overriding;

public class OverridingExampleMain {
    // override : 부모 클래스에서 상속받은 메서드를 자식에서 재정의하는 것
    // 메서드의 시그니쳐는 같아야 함(메서드를 식별할 수 있도록 도와주는 것을 말함) - 리턴타입, 메서드의 명칭, 요구하는 파라미터를 의미 함
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parentTypeChild = new Child(); // 다형성

        parent.someMethod();
        parentTypeChild.someMethod(); // 오버라이딩이 전제된 메서드는 부모타입으로도 자식측 메서드 호출 가능
    }
}
