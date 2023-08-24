package chap02_02encapsulation.prev_code;

public class PrevioudCodeExampleMain {
    public static void main(String[] args) {
        CalculateCommand calculateCommand = new CalculateCommand(
                CalculateType.DIVIDE,
                100,
                0
        );

        Client client = new Client();
        int result = client.someMethod(calculateCommand);

        System.out.println(result);
    }
}
