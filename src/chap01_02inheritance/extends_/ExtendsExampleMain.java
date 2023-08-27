package chap01_02inheritance.extends_;

import chap01_02inheritance.extends_.Child;
import chap01_02inheritance.extends_.Parent;

public class ExtendsExampleMain {
    public static void main(String[] args) {
        Parent parent = new Parent(); // 부모타입 변수에 부모타입 객체 대입
        Parent parentTypeChild = new Child(); // 부모타입 변수에 자식타입 객체 대입, 다형성
        Child child = new Child(); // 자식타입 변수에 자식타입 객체 대입

        parent.someMethod();
        System.out.println("-------");
        parentTypeChild.someMethod();
        //parentTypeChild.anotherMethod(); // Child타입 객체 내부 요소는 parent타입 변수 호출 가능
        System.out.println("---------");
        child.someMethod();
        child.anotherMethod();
    }
}
