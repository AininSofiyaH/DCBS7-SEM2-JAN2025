/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spg0453;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner kereta = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = kereta.nextLine();

        System.out.print("Enter price per unit: ");
        double price = kereta.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = kereta.nextInt();

        System.out.print("Enter discount rate (%): ");
        double discountRate = kereta.nextDouble();

        double totalPrice = price * quantity;
        double discountAmount = (discountRate / 100) * totalPrice;
        double finalPrice = totalPrice - discountAmount;

        System.out.println("\n--- Receipt ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price after Discount: $" + finalPrice);
    }
}

