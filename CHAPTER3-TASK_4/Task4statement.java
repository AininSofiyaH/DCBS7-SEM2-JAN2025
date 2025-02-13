/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4statement;
import java.util.Scanner;
/**
 *
 * @author sufi
 */
public class Task4statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("SELAMAT DATANG KE KEDAI BORONG KITAK");
        System.out.println("1.Beras - RM24.00 ");
        System.out.println("2.Minyak masak - RM29.70 ");
        System.out.println("3.Tepung - RM4.00 ");
        
        System.out.print("Masukkan nombor produk: ");
        int pilih = read.nextInt();
        
        String product = "";
        double price = 0;
                
         if (pilih == 1) {
             product = "Beras";
             price = 24.00; 
         }
         else if (pilih == 2) { 
             product = "Minyak Masak"; 
             price = 29.70; 
         }
         else if (pilih == 3) { 
             product = "Tepung"; 
             price = 4.00; }
         else { 
             System.out.println("Invalid"); 
             return;}
         
         System.out.print("Quantity: ");
         int quantity = read.nextInt();
         double total = price * quantity;
         
         System.out.println("\n-----RECEIPT-----");
         System.out.println("Product: " + product);
         System.out.println("Quantity: " + quantity);
         System.out.printf("Total Price: RM%.2f\n", total);
         System.out.println("TERIMA KASIH");
         
         read.close();
        
    }
    
}
