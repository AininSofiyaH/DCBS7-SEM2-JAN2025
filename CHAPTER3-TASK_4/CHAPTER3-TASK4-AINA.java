/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchtask4.java;
import java.util.Scanner;
/**
 *
 * @author aina
 */
public class Switchtask4Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String item_name;
    int quant, code;
    //declare variable
    
    //Menu
    System.out.println("welcome to:   ");
    System.out.println("         ~  Syurga Pastry  ~         ");
    System.out.println("1. Tiramisu  (1)      RM 15.00");
    System.out.println("2. Strawberry tart      (2)      RM 12.00");  
    System.out.println("3. Coffee pudding   (3)      RM 10.00");
    System.out.println("4. Peach Strudel      (4)      RM 14.00");
    System.out.println("");
    
    Scanner Baca = new Scanner(System.in);
    //supaya user boleh masukkan input
    
    System.out.print("Item Name: ");
    item_name = Baca.nextLine();
    //user masukkan nama food yg diorang nak
    
    System.out.print("Quantity: ");
    quant = Baca.nextInt();
    //user masukkan quantity food
    
    System.out.print("code: ");
    code =  Baca.nextInt(); 
    
    //code untuk kira total price for setiap makanan
    
     switch (code){
            
            case 01: System.out.println("\nYour order: \nTiramisu  -->  RM "  +(15 * quant));
            break;
            case 02: System.out.println("\nYour order: \nStrawberry Tart -->   RM " +(12 * quant));
            break;
            case 03: System.out.println("\nYour order: \nCoffee Puding -->   RM " +(10 * quant));
            break;
            case 04: System.out.println("\nYour order: \nPeach Strudel  -->   RM " +(14 * quant));
            break;
            default: System.out.println("NO ORDER");
            break;   
  
    }
    
     // some closure
    System.out.println("");
    System.out.println("!! Thank You for Coming , Please come again !!    ");
   
  
}
}
    
