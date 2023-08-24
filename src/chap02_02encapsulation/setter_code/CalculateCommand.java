package chap02_02encapsulation.setter_code;

// 연산에 필요한 모든 정보를 담고 있는 코드
public class CalculateCommand {
    private CalculateType calculateType;
    private int num1;
    private int num2;

    public void setCalculateType(CalculateType calculateType) {
        this.calculateType = calculateType;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // 기존 getter 삭제
    // 그럼에도 불구하고 연산 결과를 만들어서 돌려줘야 하는 상황
    // client 쪽에 있는 관련된 로직을 command쪽으로 옮겼음
    public int getCalculateResult() { // 연산 결과값을 돌려주는 메서드 (응집도 올라감)
        CalculateType calculateType = this.calculateType;
        int num1 = this.num1;
        int num2 = this.num2;

        int result = calculateType.calculate(num1, num2);

        return result;
    }

}