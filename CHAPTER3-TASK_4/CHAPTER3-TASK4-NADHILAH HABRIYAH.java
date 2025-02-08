/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package systempurchase;

/**
 *
 * @author Habriyah
 */
import java.util.Scanner;

public class SystemPurchase {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        // Welcome message
        System.out.println("==========================================");
        System.out.println("          WELCOME TO OUR STORE           ");
        System.out.println("==========================================");

        // Get details from user
        System.out.print("Enter Item Name: ");
        String item = read.nextLine();
        
        System.out.print("Enter Price per Item (RM): ");
        double price = read.nextDouble();
        
        System.out.print("Enter Quantity: ");
        int quantity = read.nextInt();
        
        // Discount selection
        System.out.println("\nChoose Discount Code:");
        System.out.println("1. Red (10%)");
        System.out.println("2. Blue (20%)");
        System.out.println("3. Green (50%)");
        System.out.println("4. Yellow (70%)");
        System.out.println("5. Magenta (0%)");
        System.out.print("Enter your choice (1-5): ");
        int discountChoice = read.nextInt();
        
        double discountRate = 0;
        switch (discountChoice) {
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
        
        // Calculate total and final price
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * (discountRate / 100);
        double finalPrice = totalPrice - discountAmount;
        
        // Payment method selection
        System.out.println("\nChoose Payment Method:");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. E-Wallet");
        System.out.println("4. QR Code");
        System.out.println("5. Online Transfer (Acc No: 534953660 - Ribbon Bank)");
        System.out.print("Enter your choice (1-5): ");
        int paymentChoice = read.nextInt();
        
        String paymentMethod;
        switch (paymentChoice) {
            case 1:
                paymentMethod = "Cash";
                break;
            case 2:
                paymentMethod = "Card";
                break;
            case 3:
                paymentMethod = "E-Wallet";
                break;
            case 4:
                paymentMethod = "QR Code";
                break;
            case 5:
                paymentMethod = "Online Transfer (Acc No: 534953660 - Ribbon Bank)";
                break;
            default:
                paymentMethod = "Invalid Payment Method";
        }
        
        // Display receipt
        System.out.println("\n==========================================");
        System.out.println("                  RECEIPT                 ");
        System.out.println("==========================================");
        System.out.println("Item:               " + item);
        System.out.println("Price per Item:     RM " + String.format("%.2f", price));
        System.out.println("Quantity:           " + quantity);
        System.out.println("------------------------------------------");
        System.out.println("Total Price:        RM " + String.format("%.2f", totalPrice));
        System.out.println("Discount Rate:      " + discountRate + "%");
        System.out.println("------------------------------------------");
        System.out.println("Final Price:        RM " + String.format("%.2f", finalPrice));
        System.out.println("Payment Method:     " + paymentMethod);
        System.out.println("==========================================");
        System.out.println("      THANK YOU FOR YOUR PURCHASE!       ");
        System.out.println("==========================================");
        
        read.close();
    }
}
