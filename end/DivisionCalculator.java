package ruangong.end;

public class DivisionCalculator implements Calculator {
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        } else {
            return num1 / num2;
        }
    }
    public void display() {
        System.out.println("Performing Division Calculation");
    }
}