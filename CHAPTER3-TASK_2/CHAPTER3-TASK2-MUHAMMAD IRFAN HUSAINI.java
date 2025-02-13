/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arithmeticprog;


 import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner output = new Scanner(System.in);
 
    System.out.print("Enter first number: ");
        double num1 = output.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = output.nextDouble();
        
        System.out.println("Choose operation:");
        System.out.println("====================");
        
        System.out.println("1. Addition (+)");
        
        System.out.println("2. Subtraction (-)");
        
        System.out.println("3. Multiplication (*)");
        
        System.out.println("4. Division (/)");
        
        System.out.print("Enter your choice (1-4): ");
        int choice = output.nextInt();
        
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result (+): " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result (-): " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result (*): " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result (/): " + result);
               
                }else{ 
                    System.out.println("Error");
    }
        }
    }
}
        
      

