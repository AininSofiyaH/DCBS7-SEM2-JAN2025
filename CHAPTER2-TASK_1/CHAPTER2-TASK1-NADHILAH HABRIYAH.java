/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticprog3;

/**
 *
 * @author Habriyah
 */
import java.util.Scanner;

public class ArithmeticProg3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = read.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = read.nextInt();

        // Output results with descriptive format
        System.out.println("\nResults of Arithmetic Operations:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        read.close();
    }
}

