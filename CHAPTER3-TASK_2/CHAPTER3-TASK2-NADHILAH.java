/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticcalculation;

/**
 *
 * @author Habriyah
 */
import java.util.Scanner;

public class ArithmeticCalculation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        // Input
        System.out.print("Enter first number: ");
        double num1 = read.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = read.nextDouble();
        
        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = read.nextInt();
        
        double result = 0;
        boolean valid = true;
        
        // Switch statement for arithmetic operations
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                valid = false;
        }
        
        // Output result
        if (valid) {
            System.out.println("Result: TADA: " + result);
        }
        
        read.close();
    }
}

