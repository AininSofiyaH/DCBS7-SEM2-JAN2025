/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3.week.pkg3;

/**
 *
 * @author adria
 */
import java.util.Scanner;
public class Task3Week3 {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
    
    public static double Task3Week3(double price, int quantity, double discountRate) {
        double totalPrice = price * quantity;
        double discount = totalPrice * (discountRate / 100);
        return totalPrice - discount;
    }

    public static void main(String[] args) {
        Scanner Go = new Scanner(System.in);
        System.out.print("Enter the item name: ");
        String itemName = Go.nextLine();

        System.out.print("Enter the price per item: $");
        double pricePerItem = Go.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = Go.nextInt();

        // Terpulang nak letak color code dalam bentuk apa" dan berapa disc nak bagi
        System.out.println("\nDiscount rate options (color code):");
        System.out.println("1. Black - 8%");
        System.out.println("2. Yellow - 15%");
        System.out.println("3. Purple - 28%");
        System.out.println("4. Pink - 35%");
        System.out.println("5. Sage Green - 40%");
        
        System.out.print("\nSelect a discount rate by entering the corresponding number: ");
        int discountChoice = Go.nextInt();

        double discountRate = 0;
        switch (discountChoice) {
            case 1:
                discountRate = 8;
                break;
            case 2:
                discountRate = 15;
                break;
            case 3:
                discountRate = 28;
                break;
            case 4:
                discountRate = 35;
                break;
            case 5:
                discountRate = 40;
                break;
            default:
                System.out.println("Invalid choice, defaulting to 0% discount.");
                discountRate = 0;
                break;
        }
        double priceAfterDiscount = Task3Week3(pricePerItem, quantity, discountRate);

        // tunjuk output boleh edit ikut kreativiti
        System.out.println("\n***** Receipt *****");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: RM" + String.format("%f", pricePerItem));
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price (Before Discount): RM" + String.format("%f", pricePerItem * quantity));
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price (After Discount): RM" + String.format("%f", priceAfterDiscount));

        
    }
}
    
    

