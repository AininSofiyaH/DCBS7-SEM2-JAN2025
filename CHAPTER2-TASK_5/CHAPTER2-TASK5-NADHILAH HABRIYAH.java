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
        Scanner scanner = new Scanner(System.in);
        
        // Enter information
        System.out.print("Item Name: ");
        String item = scanner.nextLine();
        
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        
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
        
        scanner.close();
    }
}
