package chap03_01lsp;

public class Client {
    public void someClientMethod(Parent parentOrChild){

        // 자식이 할 수 있는 일은 부모가 할 수 있어야 한다.(리스코프 치환원칙의 핵심 원칙)

        parentOrChild.someMethod(-1);
    }
}
