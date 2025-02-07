/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter2;

/**
 *
 * @author Adam
 */
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        
    Scanner boat = new Scanner(System.in);
    System.out.print("Please enter your birth year : ");
    int birthYear = boat.nextInt();
    int currentYear = 2025;
    int age = currentYear - birthYear;
    
    System.out.println("You are " + age + " years old.");
    
    }
}
