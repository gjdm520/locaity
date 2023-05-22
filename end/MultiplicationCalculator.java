package ruangong.end;

public class MultiplicationCalculator implements Calculator {
    public double calculate(double num1, double num2) {
        return num1 * num2;
    }
    public void display() {
        System.out.println("Performing Multiplication Calculation");
    }
}
