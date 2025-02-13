/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arithmeticprog;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner output = new Scanner(System.in);
        
        System.out.print("Enter item name: ");
        String itemName = output.nextLine();
        
        System.out.print("Enter price: ");
        double price = output.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = output.nextInt();
        
        System.out.println("Choose a discount color: ");
        System.out.println("==========================");
        System.out.println("1. White");
        System.out.println("2. Black");
        System.out.println("3. Grey");
        System.out.println("4. Blue");
        
        System.out.print("Enter your choice (1-4): ");
        int choice = output.nextInt();
        
        double discountRate;
        switch (choice) {
            case 1:
                discountRate = 0.25;
                break;
            case 2:
                discountRate = 0.37;
                break;
            case 3:
                discountRate = 0.52;
                break;
            case 4:
                discountRate = 0.60;
                break;
            default:
                System.out.println("Error.");
                discountRate = 0.0;
        }
        
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * discountRate;
        double finalPrice = totalPrice - discountAmount;
        
        System.out.println("\nItem: " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Price after discount: " + finalPrice);
        
        
    }
    
}
