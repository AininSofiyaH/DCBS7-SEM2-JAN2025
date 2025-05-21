/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;
import java.util.Scanner;

/**
 *
 * @author amird
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        Scanner book = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter item name: ");
        String itemName = book.nextLine();

        System.out.print("Enter price per item: ");
        double price = book.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = book.nextInt();

        System.out.print("Enter discount rate (in %): ");
        double discountRate = book.nextDouble();

        // Calculating total price and discount
        double totalPrice = price * quantity;
        double discountAmount = (discountRate / 100) * totalPrice;
        double finalPrice = totalPrice - discountAmount;

        // Displaying output
        System.out.println("\nItem Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price after Discount: $" + finalPrice);

        book.close();
    }
}
