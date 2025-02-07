/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer.requirement1;
import java.util.Scanner;
/**
 *
 * @author aina
 */
public class task5 {
    public static void main(String[] args) {
    
        String item; //declare string
        int price, quantity, discount ; //declare
        
        Scanner Read = new Scanner(System.in);
        //intruction untuk isi nama item,price item,quantity item,discount
        System.out.println("PLEASE ENTER THE ITEM NAME     : ");
        item = Read.nextLine(); //nextLine baca ayat sahaja
        System.out.println("PLEASE ENTER THE PRICE         : ");
        price = Read.nextInt(); //nextInt baca number
        System.out.println("PLEASE ENTER THE QUANTITY      : ");
        quantity = Read.nextInt();
        System.out.println("PLEASE ENTER THE DISCOUNT RATE : ");
        discount = Read.nextInt();
        
        //show input yang user isi dengan lebih kemas
        System.out.println("Item Name            : " +item);
        System.out.println("Price              : " +price);
        System.out.println("Quantity           : " +quantity);
        
        int total = price * quantity; //formula kira total
        System.out.println("Total Price         : " +total);
        System.out.println("Discount Rate        : " +discount);
        int totaldisc = (total * discount/ 100); //formula kira total disc
        int afterdisc = total - totaldisc; //formula harga lepas disc
        System.out.println("Price After Discount : " +afterdisc); //print final price
        
        Read.close();
    }
}
   
