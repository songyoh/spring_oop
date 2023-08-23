package chap01_07optional.with_optional;

public class WithOptionalExampleMain {
    public static void main(String[] args) {

        MapRepository mapRepository = new MapRepository();

        String string = mapRepository.getOptionalValue("NOT_EXIST_KEY")//("EXIST_KEY")//("NOT_EXIST_KEY")
                .orElseThrow(() -> {
                    throw new RuntimeException("없는 키값입니다.");
                }); // 해당 키로 조회한 결과가 null인데 옵셔널 반환을 받은경우 예외 발생
                    // 내부에 람다식으로 () -> {throw new 발생할예외("메세지")}; 로 작성하면 예외를 발생시킨다.
        System.out.println(string.toUpperCase());
    }
}
