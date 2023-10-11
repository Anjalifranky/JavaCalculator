//Name : Anjali Franky
//URN NO : 2022-M-18061999 
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message and instructions
        System.out.println("Simple Calculator");
        System.out.println("Available operations: +, -, *, /");

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the desired arithmetic operation
        System.out.print("Enter the operation: ");
        char operator = scanner.next().charAt(0);

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;  // Initialize the result variable

        // Use a switch statement to perform the selected arithmetic operation
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
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    // Display an error message and exit the program if division by zero is attempted
                    System.out.println("Error: Division by zero!");
                    System.exit(1);
                }
                break;
            default:
                // Display an error message and exit the program if an invalid operator is entered
                System.out.println("Error: Invalid operator!");
                System.exit(1);
        }

        // Display the calculated result to the user
        System.out.println("Result: " + result);
    }
}
