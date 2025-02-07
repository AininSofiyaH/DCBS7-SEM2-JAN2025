/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmicalculator;

/**
 *
 * @author Habriyah
 */
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        // Read
        System.out.print("Enter your weight (kg): ");
        double weight = read.nextDouble();
        
        System.out.print("Enter your height (m): ");
        double height = read.nextDouble();
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        // Determine BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        
        // Display results
        System.out.println("\nBMI Details:");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("Your BMI: " + bmi);
        System.out.println("Category: " + category);
        
        read.close();
    }
}

