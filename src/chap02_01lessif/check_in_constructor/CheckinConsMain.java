package chap02_01lessif.check_in_constructor;

public class CheckinConsMain {
    public static void main(String[] args) { // 예시를 보기위해 작성한 main 코드
        CalculateCommand calculateCommand = new CalculateCommand(null, 1, 3); // null입력 허용, 컴파일에러가 안난다.
    }
}
