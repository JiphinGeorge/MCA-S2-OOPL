package prgm_16_ArithematicPackage;

public class Divide implements ArithmeticOperations {

    public void add(double a, double b) { }

    public void subtract(double a, double b) { }

    public void multiply(double a, double b) { }

    public void divide(double a, double b) {

        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Division by zero not allowed");
    }
}
