package ruangong.end;

public class CalculatorFactory {
    public static Calculator getCalculator(String operator) {
        switch (operator) {
            case "+":
                return new AdditionCalculator();
            case "-":
                return new SubtractionCalculator();
            case "*":
                return new MultiplicationCalculator();
            case "/":
                return new DivisionCalculator();
            default:
                return null;
        }
    }
}