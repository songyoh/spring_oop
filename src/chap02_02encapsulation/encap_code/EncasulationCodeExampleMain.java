package chap02_02encapsulation.encap_code;

public class EncasulationCodeExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand(
                CalculateType.ADD,
                100,
                3
        );

        Client client = new Client();
        int result = client.someMethod(calculateCommand);
        System.out.println(result);
    }// 기능은 유지하면서 코드를 유지보수적으로 조정한 것 : 리팩토링
}
