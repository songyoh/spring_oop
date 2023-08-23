package chap01_06object.equals_;

public class EqualsExampleMain {
    public static void main(String[] args) {
        SomeObject sameObject1 = new SomeObject(1, "asdf"); // new라는 키워드는 힙에 주소를 할당해 저장하므로 내용이 같아도 각각 다른 객체이다.
        SomeObject sameObject2 = new SomeObject(1, "asdf");

        SomeObject anotherObject = new SomeObject(99,"qwer");

        // 동일성 비교(레퍼런스 주소 비교)
        System.out.println(sameObject1 == sameObject2); // false

        // 동등성 비교(equals를 오버라이딩 했을때 기준으로 비교) // 주소가 다르지만 멤버변수는 동일(일치)
        System.out.println(sameObject1.equals(sameObject2)); // false // SomeObject에서 generate->equals ans hashcode설정을 했더 true로 바뀌었다.

        // 동등성 비교 // 주소도 다르고 멤버변수도 다름(불일치)
        System.out.println(sameObject1.equals(anotherObject)); // false
    }
}
