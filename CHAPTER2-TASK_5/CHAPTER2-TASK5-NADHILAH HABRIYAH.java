/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discount;

/**
 *
 * @author Habriyah
 */
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        // Read the information
        System.out.print("Item Name: ");
        String item = read.nextLine();
        
        System.out.print("Price: ");
        double price = read.nextDouble();
        
        System.out.print("Quantity: ");
        int quantity = read.nextInt();
        
        System.out.print("Discount Rate (%): ");
        double discount = scanner.nextDouble();
        
        // Calculation
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * (discount / 100);
        double finalPrice = totalPrice - discountAmount;
        
        // Output
        System.out.println("\nItem: " + item);
        System.out.println("Price per Item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Price After Discount: " + finalPrice);
        
        read.close();
    }
}
