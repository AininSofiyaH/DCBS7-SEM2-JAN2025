/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agecalculator;

/**
 *
 * @author Habriyah
 */
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        // Ask for Enter user's year of birth
        System.out.print("Enter your year of birth: ");
        int birthYear = read.nextInt();
        
        // Enter the current year
        int currentYear = 2025; 
        
        // Calculate the age recently
        int age = currentYear - birthYear;
        
        // Display the result based on data input
        System.out.println("\nYour age is: " + age + " years old.");
        
        read.close();
    }
}

