/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticprog.java;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ArithmeticProgJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: :");
        int num2 = scanner.nextInt();
        
        System.out.println("\nArithmetic Operations: ");
        
        int sum = num1 + num2;
        System.out.println("Sum: " + num1 + "+" + num2 + "=" +sum);
        
        int difference = num1 - num2;
        System.out.println("Difference: " + num1 + " - " + num2 + " = " + difference);

        int product = num1 * num2;
        System.out.println("Product: " + num1 + " * " + num2 + " = " + product);

        if (num2 != 0) {
            int quotient = num1 / num2;
            System.out.println("Quotient: " + num1 + " / " + num2 + " = " + quotient);
        } else {
            System.out.println("Cannot divide by zero!");
        }

        
        if (num2 != 0) {
            int remainder = num1 % num2;
            System.out.println("Remainder: " + num1 + " % " + num2 + " = " + remainder);
        } else {
            System.out.println("Cannot compute remainder when dividing by zero!");
        }

        
        scanner.close();
        
    
    
    
    } 
    
}
