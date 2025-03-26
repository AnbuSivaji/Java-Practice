import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Java Calculator");
        System.out.println("----------------------");

        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input operator (+, -, *, /)
        System.out.print("Enter operator (+, -, *, /,%): ");
        char operator = scanner.next().charAt(0);

        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;
        boolean validOperator = true;

        // Perform calculation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperator = false;
                    result = 0;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                validOperator = false;
                result = 0;
        }
            

        // Print result if operator was valid
        if (validOperator) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}