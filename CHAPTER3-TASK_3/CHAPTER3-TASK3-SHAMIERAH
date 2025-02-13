/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discountprogram;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author sammy
 */
public class DiscountProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        // Define color codes and their associated discount rates
        Map<String, Double> colorCodeDiscounts = new HashMap<>();
        colorCodeDiscounts.put("red", 0.1);   // 10% discount
        colorCodeDiscounts.put("blue", 0.15); // 15% discount
        colorCodeDiscounts.put("green", 0.2); // 20% discount
        
        // User input for item details
        System.out.print("Enter item name: ");
        String itemName = read.nextLine();
        System.out.print("Enter price per item: ");
        double pricePerItem = read.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = read.nextInt();
        
        // Display menu for color-coded discount rate selection
        System.out.println("Select discount rate by color code:");
        for (String color : colorCodeDiscounts.keySet()) {
            System.out.println(color.substring(0, 1).toUpperCase() + color.substring(1) + ": " + (colorCodeDiscounts.get(color) * 100) + "% discount");
        }
        
        // User input for color code
        read.nextLine(); // consume newline
        System.out.print("Enter color code: ");
        String selectedColor = read.nextLine().toLowerCase();
        
        // Validate color code and display item details
        if (colorCodeDiscounts.containsKey(selectedColor)) {
            double discountRate = colorCodeDiscounts.get(selectedColor);
            displayItemDetails(itemName, pricePerItem, quantity, discountRate);
        } else {
            System.out.println("Invalid color code selected. No discount applied.");
        }
        
        read.close();
    }
    
    // Function to display item details with applied discount
    private static void displayItemDetails(String itemName, double pricePerItem, int quantity, double discountRate) {
        double totalPrice = pricePerItem * quantity;
        double priceAfterDiscount = totalPrice * (1 - discountRate);
        
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: RM" + String.format("%.2f", pricePerItem));
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: RM" + String.format("%.2f", totalPrice));
        System.out.println("Discount Rate: " + (discountRate * 100) + "%");
        System.out.println("Price after Discount: RM" + String.format("%.2f", priceAfterDiscount));
    }
}

