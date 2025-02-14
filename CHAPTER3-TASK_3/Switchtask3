/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchtask3;
import java.util.Scanner;
/**
 *
 * @author aina
 */
public class Switchtask3 {

    /**
     * @param args the command line arguments
     */
    
        public static double discountProgram(double price, int quantity, double discountRate) {
        double totalPrice = price * quantity;
        double discount = totalPrice * (discountRate / 100);
        return totalPrice - discount;
    }

    public static void main(String[] args) {
        Scanner Baca = new Scanner(System.in);
        System.out.print("Enter Nama Item: ");
        String itemName = Baca.nextLine();

        System.out.print("Enter the price per item: $");
        float pricePerItem = Baca.nextFloat();

        System.out.print("Enter the quantity: ");
        int quantity = Baca.nextInt();

        // can set any type of colours and the discount rate
        System.out.println("\nDiscount rate options (color code):");
        System.out.println("1. Merah - 10%");
        System.out.println("2. Biru - 15%");
        System.out.println("3. Purple - 25%");
        System.out.println("4. Matcha - 35%");
        System.out.println("5. Orangey - 40%");
        
        System.out.print("\nPilih kadar diskaun dengan memasukkan nombor yang sesuai: ");
        int discountChoice = Baca.nextInt();

        float discountRate = 0;
        switch (discountChoice) {
            case 1:
                discountRate = 10;
                break;
            case 2:
                discountRate = 15;
                break;
            case 3:
                discountRate = 25;
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
        
        double priceAfterDiscount = discountProgram(pricePerItem, quantity, discountRate);

        // tunjuk output dengan lebih teratur
        System.out.println("\n*** Receipt ***");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: RM" + String.format("%f", pricePerItem));
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price (Before Discount): RM" + String.format("%f", pricePerItem * quantity));
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price (After Discount): RM" + String.format("%f", priceAfterDiscount));

        
    }

    }
    

