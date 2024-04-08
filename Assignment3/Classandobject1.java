// Package declaration
import java.util.*;

// Interface for basic arithmetic operations
interface BasicOperations {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

// Interface for advanced operations
interface AdvancedOperations {
    double power(double base, double exponent);
    double squareRoot(double num);
    double cubicRoot(double num);
    double sin(double angleInRadians);
    double cos(double angleInRadians);
    double tan(double angleInRadians);
    double log(double base, double num);
    double exp(double num);
    double absoluteValue(double num);
}

// Calculator class implementing both basic and advanced operation interfaces
public class Classandobject1 implements BasicOperations, AdvancedOperations {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        return a / b;
    }

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    @Override
    public double cubicRoot(double num) {
        return Math.cbrt(num);
    }

    @Override
    public double sin(double angleInRadians) {
        return Math.sin(angleInRadians);
    }

    @Override
    public double cos(double angleInRadians) {
        return Math.cos(angleInRadians);
    }

    @Override
    public double tan(double angleInRadians) {
        return Math.tan(angleInRadians);
    }

    @Override
    public double log(double base, double num) {
        return Math.log(num) / Math.log(base);
    }

    @Override
    public double exp(double num) {
        return Math.exp(num);
    }

    @Override
    public double absoluteValue(double num) {
        return Math.abs(num);
    }

    public static void main(String[] args) {
      
        Classandobject1 calculator = new Classandobject1();

        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));

        System.out.println("Power: " + calculator.power(2, 3));
        System.out.println("Square Root: " + calculator.squareRoot(9));
        System.out.println("Cubic Root: " + calculator.cubicRoot(27));

        System.out.println("Sine: " + calculator.sin(Math.PI / 2));
        System.out.println("Cosine: " + calculator.cos(Math.PI));
        System.out.println("Tangent: " + calculator.tan(Math.PI / 4));

        System.out.println("Logarithm: " + calculator.log(10, 100));
        System.out.println("Exponential: " + calculator.exp(2));
        System.out.println("Absolute Value: " + calculator.absoluteValue(-5));
    }
}
