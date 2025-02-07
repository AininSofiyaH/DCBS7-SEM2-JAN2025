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
public class Task6 {
    public static void main(String[] args) {
        
        Scanner body = new Scanner (System.in);
        
       System.out.print("Please enter your weight in kilogram (KG)): ");
       double weight = body.nextDouble();
       
       System.out.print("Please enter your height in centimeter (CM): ");
       double height =  body.nextDouble();
       
       double bmi = weight / (height * height);
       
       System.out.println("\n===== BMI RESULTS ===== ");
       System.out.println("Weight: " + weight + "KG");
       System.out.println("Height: " + height + "CM");
    }
}
