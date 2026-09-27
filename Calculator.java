import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Calculator =====");
        System.out.println("Operations: +  -  *  /");
        System.out.println("Type 'q' to quit");

        while (true) {
            System.out.print("\nEnter operation (+, -, *, /): ");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!");
                break;
            }

            if (!operation.equals("+") &&
                !operation.equals("-") &&
                !operation.equals("*") &&
                !operation.equals("/")) {

                System.out.println("Invalid operation!");
                continue;
            }

            try {
                System.out.print("Enter first number: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter second number: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                double result;

                if (operation.equals("+")) {
                    result = num1 + num2;
                } 
                else if (operation.equals("-")) {
                    result = num1 - num2;
                } 
                else if (operation.equals("*")) {
                    result = num1 * num2;
                } 
                else {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                    result = num1 / num2;
                }

                System.out.println("Result: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers!");
            }
        }

        scanner.close();
    }
}
