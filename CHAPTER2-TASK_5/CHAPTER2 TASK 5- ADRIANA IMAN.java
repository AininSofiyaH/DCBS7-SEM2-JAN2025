/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg5;

/**
 *
 * @author adria
 */
import java.util.Scanner;
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner disc = new Scanner(System.in);
        System.out.print("Please enter the item name: ");
        String itemName = disc.nextLine();
        
         System.out.print("Please enter the price : ");
        double priceItem = disc.nextDouble();      
        
        System.out.print("Please enter the quantity of the item : ");
        int quantity = disc.nextInt();  
        
        System.out.print("Please enter the discount rate : ");
        double discountRate = disc.nextDouble();  
        
        double totalPrice = priceItem * quantity;
        double discountAmount = (totalPrice * discountRate) / 100;
        double finalPrice = totalPrice - discountAmount;
        
        System.out.println("\n===== Output =====");
        System.out.println("Item Name      : " + itemName);
        System.out.println("Price Item     : " + priceItem);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Total Price    : " + totalPrice);
        System.out.println("Discount Rate  : " + discountRate + "%");
        System.out.println("Final Price    : " + finalPrice);
    }
}
    
