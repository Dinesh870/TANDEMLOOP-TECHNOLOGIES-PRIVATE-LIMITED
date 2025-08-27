import java.util.*;

public class Program_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter first number");
            double input_1 = sc.nextDouble();
            
            System.out.println("Enter second number");
            double input_2 = sc.nextDouble();

            System.out.println("Eneter operation like(add/subtract/multiply/divide)");
            String operation = sc.next();

            Calculator calculator = new Calculator();

            double result = calculator.calculate(input_1, input_2, operation);

            System.out.println(result);
        } catch(InputMismatchException e) {
            System.out.println("Please enter number only!");
        }
        catch(Exception e) {
            System.out.println("Something went wrong!");
        }


        sc.close();
    }
}

class Calculator {

    private double add(double a, double b) {
        return a+b;
    }
    private double substract(double a, double b) {
        return a-b;
    }
    private double multiply(double a, double b) {
        return a*b;
    }
    private double divide(double a, double b) {
        return a/b;
    }
    
    public double calculate(double a, double b, String operation) {
        switch (operation) {
            case "add":
                return add(a, b);
            case "subtract":
                return substract(a, b);
            case "multiply":
                return multiply(a, b);
            case "divide":
                return divide(a, b);
            default:
                return 0.0;
        }
    }
}
