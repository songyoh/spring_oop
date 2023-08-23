package chap01_06object.hashcode_;

public class HashcodeExampleMain {
    public static void main(String[] args) {
        // Hash관련 컬렉션이 같은 인스턴스를 구분하는 방법
        // HashCode를 비교해서 필터링 한 다음 -> equals로 필터링된 자료들간 비교
        // equals비교를 처음부터 끝까지 하는것보다 Hashcode를 이용한 필터링이 자원을 덜 소모하기 때문이다.
        // 다만, HashCode의 결과값은 중복값이 나올 수 있는 구조이므로 equals없이 HashCode만으로 값을 정확하게 조회할 수 있다는 보장은 없다.

        SomeObject sameObject1 = new SomeObject(1, "asdf");
        SomeObject sameObject2 = new SomeObject(1, "asdf");

        System.out.println(sameObject1.hashCode()); // 3004436 (같은값이 들어가 있기 때문에 같음) // 2055281021
        System.out.println(sameObject2.hashCode()); // 3004436                           // 1554547125(SomeObject의 hashcode 주석처리시 나타나는 주소)
    }
}
