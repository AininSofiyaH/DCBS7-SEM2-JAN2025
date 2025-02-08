/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discountcalculation;

/**
 *
 * @author Habriyah
 */
import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        // Ask user enter the information
        System.out.print("Enter Item Name: ");
        String item = read.nextLine();
        
        System.out.print("Enter Price per Item: ");
        double price = read.nextDouble();
        
        System.out.print("Enter Quantity: ");
        int quantity = read.nextInt();
        
        System.out.println("Choose Discount Code:");
        System.out.println("1. Red (10%)");
        System.out.println("2. Blue (20%)");
        System.out.println("3. Green (50%)");
        System.out.println("4. Yellow (70%)");
        System.out.println("5. Magenta (0%)");
        System.out.print("Enter your choice (1-5): ");
        int choice = read.nextInt();
        
        double discountRate = 0;
        
        // Switch statement for discount selection
        switch (choice) {
            case 1:
                discountRate = 10;
                break;
            case 2:
                discountRate = 20;
                break;
            case 3:
                discountRate = 50;
                break;
           case 4:
                discountRate = 70;
                break;
            case 5:
                discountRate = 0;
                break;
            default:
                System.out.println("Invalid choice. No discount applied.");
        }
        
        
        // Calculation
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * (discountRate / 100);
        double finalPrice = totalPrice - discountAmount;
        
        // Output
        System.out.println("                ");
        System.out.println("                ");
        System.out.println(" --------  RECEIPT  -------   ");
        System.out.println("Item: " + item);
        System.out.println("Price per Item: " + String.format("%.2f", price));
        System.out.println("Quantity: " + quantity); 
        System.out.println("Total Price: " + String.format("%.2f", totalPrice));
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price After Discount: " + String.format("%.2f", finalPrice));
        
        read.close();
    }
}

