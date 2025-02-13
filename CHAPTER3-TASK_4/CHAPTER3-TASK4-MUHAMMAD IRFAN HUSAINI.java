/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arithmeticprog;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
  Scanner output = new Scanner(System.in);
  
  System.out.print("Enter item name: ");
        String itemName = output.nextLine();
        
        System.out.print("Enter price: ");
        double price = output.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = output.nextInt();
        
        double totalPrice = price * quantity;
        
        System.out.println("Choose a payment method: ");
        System.out.println("==========================");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. QR Code");
        
        System.out.print("Enter your choice (1-3): ");
        int paymentChoice = output.nextInt();
        String paymentMethod;
        
        switch (paymentChoice) {
            case 1:
                paymentMethod = "Cash";
                break;
            case 2:
                paymentMethod = "Card";
                break;
            case 3:
                paymentMethod = "QR Code";
                break;
            default:
                paymentMethod = "Unknown";
                System.out.println("Error");
        }
        
        System.out.println("\nOrder Summary:");
        System.out.println("Item: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Payment method: " + paymentMethod);
        
        System.out.println("\nOrder processed successfully!");
        
        
    }
    
}
