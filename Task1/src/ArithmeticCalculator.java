import java.util.Scanner;

public class ArithmeticCalculator {
    private int num1;
    private int num2;

    public ArithmeticCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void calculate(Operation operation) {
        if (operation == Operation.ADD) {
            System.out.println(num1 + num2);
        } else if (operation == Operation.SUBTRACT) {
            System.out.println(num1 - num2);
        } else if (operation == Operation.MULTIPLY) {
            System.out.println(num1 * num2);
        }
    }
}
