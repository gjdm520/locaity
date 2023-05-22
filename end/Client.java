package ruangong.end;

public class Client {
    public static void main(String[] args) {
        CalculatorFactory factory = new CalculatorFactory();

        Calculator calculator1 = factory.getCalculator("+");
        double result1 = calculator1.calculate(3, 4);
        calculator1.display();
        System.out.println(result1);

        Calculator calculator2 = factory.getCalculator("-");
        double result2 = calculator2.calculate(5, 2);
        calculator2.display();
        System.out.println(result2);

        Calculator calculator3 = factory.getCalculator("*");
        double result3 = calculator3.calculate(6, 7);
        calculator3.display();
        System.out.println(result3);

        Calculator calculator4 = factory.getCalculator("/");
        double result4 = calculator4.calculate(8, 2);
        calculator4.display();
        System.out.println(result4);
    }
}

/**
+------------------+
        |     Calculator   |
        +------------------+
        | - calculate()    |
        | - display()      |
        +------------------+
        ^
        |
        +------------------+
        | AdditionCalculator|
        +------------------+
        | + calculate()    |
        | + display()      |
        +------------------+
        ^
        |
        +------------------+
        |SubtractionCalculator|
        +------------------+
        | + calculate()    |
        | + display()      |
        +------------------+
        ^
        |
        +------------------+
        |MultiplicationCalculator|
        +------------------+
        | + calculate()    |
        | + display()      |
        +------------------+
        ^
        |
        +------------------+
        |  DivisionCalculator |
        +------------------+
        | + calculate()    |
        | + display()      |
        |--------------+---+
        |
        |
        +----------------+
        |CalculatorFactory|
        +----------------+
        |getCalculator() |
        +----------------+

 **/