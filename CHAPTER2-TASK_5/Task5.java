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
public class Task5 {
     public static void main(String[] args) {
     
        Scanner disc = new Scanner(System.in);
        System.out.print("Please enter the item name: ");
        String itemName = disc.nextLine();
        
        System.out.print("Please enter the item price: ");
        double priceItem = disc.nextDouble();
        
        System.out.print("Please enter the item quantity of the item: ");
        double quantity = disc.nextDouble();
        
        System.out.print("Please enter the discount rate for this item: ");
        double discountRate = disc.nextDouble();
        
        double totalPrice = priceItem * quantity;
        double discountAmount = (totalPrice * discountRate) / 100;
        double finalPrice = totalPrice  - discountAmount; 
        
        System.out.println("\n ===== Output =====");
        System.out.println("Item Name     : " + itemName);
        System.out.println("Price Item    : " + priceItem);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Total Price   : " + totalPrice);
        System.out.println("Discount Rate : " + discountRate + "%");
        System.out.println("Final Price   : " + finalPrice);
     }
}
