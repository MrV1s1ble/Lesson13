public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(9,2);
        calculator.calculate(Operation.MULTIPLY);
        calculator.calculate(Operation.ADD);
        calculator.calculate(Operation.SUBTRACT);
    }
}