/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplepurchasingsystem;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class SimplePurchasingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Laptop: RM4000");
        System.out.println("2. iPhone 13: RM2500");
        System.out.println("3. iPhone 14: RM3000");
        System.out.println("4. iPhone 16: RM4000");
        System.out.println("Enter the product number you want to buy");
        
        int productChoice = scanner.nextInt();
        String productName = "";
        double productPrice = 0;
        
        if(productChoice == 1) {
            productName = "Laptop";
            productPrice = 4000;
        } else if(productChoice == 2) {
            productName = "iPhone 13";
            productPrice = 2500;
        } else if(productChoice == 3) {
            productName = "iPhone 14";
            productPrice = 3000;
        } else if(productChoice == 4) {
            productName = "iPhone 16";
            productPrice = 4000;
        } else {
            System.out.println("Invalid choice! Please restart the program and enter a valid option");
            scanner.close();
            return;
        }
        
        System.out.println("Enter the quantity");
        int quantity = scanner.nextInt();
        
        double totalPrice = productPrice * quantity;
        double finalPrice = totalPrice;
        
        
        
        System.out.println("\n--- Order Summary ---");
        System.out.println("Product Name   : " + productName);
        System.out.println("Price per Item : RM" + productPrice);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Total Price    : RM" + totalPrice);
        
        System.out.println("Final Price    : RM" + finalPrice);

        System.out.println("\nThank you for shopping with us!");

        scanner.close();
    }
    
}
