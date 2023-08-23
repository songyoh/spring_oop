package chap01_04enum.basic;

public class Client {
    public int someMethod(CalculateCommand calculateCommand) {
        CalculateType calculateType = calculateCommand.getCalculateType();
        int num1 = calculateCommand.getNum1();
        int num2 = calculateCommand.getNum2();

        int result = 0;

        if(calculateType.equals(CalculateType.ADD)){
            result = num1 + num2;
        } else if (calculateType.equals(CalculateType.MINUS)) {
            result = num1 - num2;
        } else if (calculateType.equals(CalculateType.MULTIPLY)) {
            result = num1 * num2;
        } else if (calculateType.equals(CalculateType.DIVIDE)) {
            result = num1 / num2;
        }
        return result;
    } //사칙연산 중 어떤 숫자들로 기능을 써서 리턴해라.
} // 클라이언트가 기능 내부를 모두 알게된 상황
