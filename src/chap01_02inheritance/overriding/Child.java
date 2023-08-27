package chap01_02inheritance.overriding;

public class Child extends Parent{
    // 부모쪽 메서드와 시그니쳐는 같지만 실행구문이 달라짐.(재정의 함)
    @Override
    public void someMethod() {
        System.out.println("Child someMethod");
    }
}
