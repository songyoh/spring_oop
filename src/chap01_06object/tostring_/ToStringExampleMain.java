package chap01_06object.tostring_;

public class ToStringExampleMain {
    public static void main(String[] args) {
        SomeObject someObject1 = new SomeObject(1, "pppp");
        SomeObject someObject2 = new SomeObject(3, "qqqq");

        // toString()에 정의된 내용이 콘솔에 찍힘
        // 재정의 하지 않았다면 레퍼런스 주소가 출력됨
        System.out.println(someObject1);// chap01_06object.tostring_.SomeObject@7a81197d //SomeObject{intField=1, stringField='pppp'}
        System.out.println(someObject2);// chap01_06object.tostring_.SomeObject@5ca881b5 //SomeObject{intField=3, stringField='qqqq'}
    }
}
