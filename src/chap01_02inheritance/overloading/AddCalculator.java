package chap01_02inheritance.overloading;

public class AddCalculator {

    // 메서드 오버로딩 요건
    // 1. 메서드 이름을 중복해서 여러 개 선언
    // 2. 단, 선언된 같은 이름의 메서드간 요구 파라미터의 개수나 타입은 달라야 한다
    // 3. 리턴타입의 동일여부는 오버로딩에 영향을 주지 않는다.
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // return타입만 다르게 오버로딩 하는건 불가능
//    public long add(int num1, int num2) {
//        return num1 + num2;
//    }

    public long add(long num1, long num2) {
        return num1 + num2;
    }

    public void test() {
        add(30, 50); // 파라미터에 int 타입이 대입
        add(1L, 2L); // 파라미터에 long 타입을 대입했기 때문에 add(long num1, long num2)가 실행될 것이다.
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

}
