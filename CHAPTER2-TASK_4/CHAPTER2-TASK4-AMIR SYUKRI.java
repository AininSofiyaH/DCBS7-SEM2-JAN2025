/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;
import java.util.Scanner;

/**
 *
 * @author amird
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        Scanner boat = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = boat.nextLine ();
        
        System.out.print("Enter your ID: ");
        String id = boat.nextLine();

        System.out.print("Enter your Subject: ");
        String subject = boat.nextLine();

        System.out.print("Enter marks for Test 1 (out of 100): ");
        double test1 = boat.nextDouble();

        System.out.print("Enter marks for Test 2 (out of 100): ");
        double test2 = boat.nextDouble();

        // Calculating average
        double average = (test1 + test2) / 2;

        // Displaying output
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Mark: " + average);

        boat.close();
        
    }
}
