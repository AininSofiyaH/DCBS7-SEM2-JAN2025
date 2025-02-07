/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task5pricecalculator;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Task5PriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter item name: ");
        String itemName = scanner.nextLine();
        
        System.out.println("Enter price of item");
        double price = scanner.nextDouble();
        
        System.out.println("Enter quantity: ");
        int quantity = scanner.nextInt();
        
        System.out.println("Enter discount rate (in %): ");
        double discountRate = scanner.nextDouble();
        
        double totalPrice = price * quantity;
        double discountAmount = (discountRate/ 100) * totalPrice;
        double finalPrice = totalPrice - discountAmount;
        
        System.out.println("\n--- Invoice ---");
        System.out.println("Item Name:" +itemName);
        System.out.println("Price per item RM" +price);
        System.out.println("Quantity: " +quantity);
        System.out.println("Total Price: RM" +totalPrice);
        System.out.println("Discount Rate: " +discountRate);
        System.out.println("Price after discount: RM" +finalPrice);
        
        scanner.close();
        
        
    
    }
    
}
