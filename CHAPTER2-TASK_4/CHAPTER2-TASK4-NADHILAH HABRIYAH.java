/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmarks;

/**
 *
 * @author Habriyah
 */

import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Axk user enter information
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter Subject: ");
        String subject = scanner.nextLine();
        
        System.out.print("Enter Test 1 Marks (/100): ");
        double test1 = scanner.nextDouble();
        
        System.out.print("Enter Test 2 Marks (/100): ");
        double test2 = scanner.nextDouble();
        
        // Calculate average
        double average = (test1 + test2) / 2;
        
        // Display results
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Marks: " + average);
        
        scanner.close();
    }
}

