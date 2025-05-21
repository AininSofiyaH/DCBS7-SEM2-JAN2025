/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;
import java.util.Scanner;
/**
 *
 * @author amird
 */
public class CHAPTER2TASK6 {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for weight in kg
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();
        
        // Ask the user for height in meters
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        // Determine BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        
        // Display the result
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("BMI Category: " + category);
        
        // Close the scanner
        sc.close();
    }
}
