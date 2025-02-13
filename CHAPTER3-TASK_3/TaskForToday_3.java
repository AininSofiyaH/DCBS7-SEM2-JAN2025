/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter3;
import java.util.Scanner;
/**
 *
 * @author Fatihah
 */
public class TaskForToday_3 {
     public static void main(String[] args) {

        //TFT 3 (Chapter 3)
        //(1)
        
        //declare variable
        String item_name;
        double price, total_price; 
        int quantity;
        char discount;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("// Welcome to Kedai Borong \\");
        System.out.println("                           ");
        System.out.println("1. Beras   (R)      RM 45");
        System.out.println("2. Minyak  (B)      RM 35");
        System.out.println("3. Tepung  (G)      RM 20");
        
        System.out.println("");
        System.out.print("Item name: ");   //user input the thing they want to buy
        item_name = read.nextLine();
        
        //harga
        System.out.print("Price (per item): ");   //user input the price
        price = read.nextInt();
        
        //kuantiti
        System.out.print("Kuantiti: ");       //user input the quantity of the thing they want
        quantity = read.nextInt();
     
        
        //calsulation of total price
        total_price = price * quantity;
        System.out.println("Total price: \nRM " +(price) + " x " +(quantity)+ " = RM" + (price * quantity));
        
         //discount rate
        System.out.println("");
        System.out.println("Discount Color");
        System.out.println("1. Red (R) = 3% ");
        System.out.println("2. Blue (B) = 5% ");
        System.out.println("3. Green (G) = 10% ");
        System.out.println("Choose R / B / G: ");
        discount = read.next().charAt(0);
        //user choose the discount color base on their item
        
        //Show everything / summarization
        System.out.println("");
        System.out.println(" --------------  RESULT  -------------- ");
        System.out.println("Item Name: " +item_name);
        System.out.println("Quantity: " +quantity);
        System.out.println("Price (per item): RM " +price);
        System.out.println("Total price: RM " +total_price );
        System.out.println("Discount colour: " +discount);
        
        
        // Price after discount 
        
         switch (discount){
            
            case 'R' : System.out.println (("Price after discount: RM ") +(total_price - (0.03 * total_price)));
            break;
            case 'B' : System.out.println (("Price after discount: RM ") +(total_price - (0.05 * total_price)));
            break;
            case 'G' : System.out.println (("Price after discount: RM ") +(total_price - (0.1 * total_price)));
            break;
            default: System.out.println("INVALID NUMBER. ERROR.");
            break;
            
         }
       
            //(2)

        
     }
}

