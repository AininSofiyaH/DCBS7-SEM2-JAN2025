/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskfortoday5;
import java.util.Scanner;

/**
 *
 * @author qisina
 */
public class TaskForToday5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String item_name;
        double price, quantity, total_price, discount_rate; 
        double price_aft_discount;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println(" //   Welcome to NA'S CAFE     \\");
        System.out.println("                MENU                ");
        System.out.println("1. Iced Caramel Machiatto      RM 6");
        System.out.println("2. Rainbow Cake                RM 5.50");
        System.out.println("3. Chocolate Indulgence Cake   RM 7");
        
        System.out.println("What you buy: ");
        item_name = read.nextLine();
        
        
        System.out.print("Price (per item): ");
        price = read.nextDouble();
        
        
        System.out.println("Quantity: ");       
        quantity = read.nextInt();
     
       
        total_price = price * quantity;
        System.out.println("Total price = RM " + price + " x " + quantity + " = RM" + total_price);
        
        
        System.out.println("Discount rate (/100) = ");
        discount_rate = read.nextDouble();
        
        
        double harga_diskaun = (discount_rate/100) * total_price;
        price_aft_discount = harga_diskaun - total_price;
        System.out.println("Price after discount = ");
        
        read.close();
    }
    
}
