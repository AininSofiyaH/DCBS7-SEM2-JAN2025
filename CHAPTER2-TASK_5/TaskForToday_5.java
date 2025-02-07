/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6_chapter.pkg2.task.pkgfor.today;
import java.util.Scanner;

/**
 *
 * @aut* @author Fatihah
 */
public class TaskForToday_5 {
    
    public static void main(String[] args) {
        
        //TFT 5 (Chapter 2)
        /*
        String item_name;
        double price, quantity, total_price, discount_rate; 
        double price_aft_discount;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println(" // Welcome to Kedai masak \\");
        System.out.println("                MENU                ");
        System.out.println("1. kuali    RM 3");
        System.out.println("2. pinggan   RM 1.50");
        System.out.println("3.  mangkuk   RM 2");
        
        System.out.println("What you buy: ");
        item_name = read.nextLine();
        
        
        //harga
        System.out.print("Price (per item): ");
        price = read.nextInt();
        
        
        //kuantiti
        System.out.println("Kuantiti: ");       
        quantity = read.nextInt();
     
        
        //total price
        total_price = price * quantity;
        System.out.println("Total price = RM " +(price) + " x " +(quantity)+ " = RM" + (price * quantity));
        
        //discount rate
        System.out.println("Discount rate (/100) = ");
        discount_rate = read.nextInt();
        
        //price after discount
        double harga_diskaun = (discount_rate/100) * total_price;
        price_aft_discount = harga_diskaun - total_price;
        System.out.println("Price after discount = ");
        */
        
        //TFT 5 (Chapter 2)
        //klu beli barang 4 dan ke ats je 
        //klu beli kurang kan x dapat diskaun (harga asal) so xleh pki coding ni
        
        String item_name;
        int quant1, quant2; 
        double price1, price2,discount, price_aft_discount, discount_price, discount_rate, original_price, total_price;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println(" // Welcome to All Store \\");
        System.out.println(" Everything is per boxes ");
        System.out.println("1. Tepung    RM 30");
        System.out.println("2. Gula      RM 10");
        System.out.println("3. Minyak    RM 60");
        System.out.println(" * 3% discount per 4 boxes ");
        System.out.println(" ");
        
        System.out.println("What you buy: ");
        item_name = read.nextLine();
        
        //harga
        System.out.print("Price (per item): ");
        price1 = read.nextInt();
        
        System.out.println("Quantity: ");
        quant1 = read.nextInt();
        
        original_price = price1 * quant1;
        System.out.println("Original price: RM " +(price1 * quant1));
        

        //diskaun 4 barang
        
        quant2 = quant1 - 4;
        price2 = price1 * 4;
        discount_rate = 0.03;
        discount_price = (discount_rate) * price2;
        
        price_aft_discount = price2 - discount_price;
        total_price = (price1 * quant2) + price_aft_discount;
        
        System.out.println(" ");
        System.out.println(" RESULT ");
        System.out.println("Item name: " +(item_name));
        System.out.println("Price per item: RM " +(price1));
        System.out.println("Quantity: " +(quant1));
        System.out.println("Original price = RM " +(original_price));
        System.out.println("Diskaun rate: " +(discount_rate));
        System.out.println("Total price: RM " +(total_price));

    }
}
