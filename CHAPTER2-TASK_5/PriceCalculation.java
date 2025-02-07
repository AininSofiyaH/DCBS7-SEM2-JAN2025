/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pricecalculation;
import java.util.Scanner;
/**
 *
 * @author sammy
 */
public class PriceCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String item;
        int price, qua, disc;
        
        Scanner read = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE ITEM NAME     : ");
        item = read.nextLine();
        System.out.println("PLEASE ENTER THE PRICE         : ");
        price = read.nextInt();
        System.out.println("PLEASE ENTER THE QUANTITY      : ");
        qua = read.nextInt();
        System.out.println("PLEASE ENTER THE DISCOUNT RATE : ");
        disc = read.nextInt();
        
        read.close();
        
        System.out.println("ITEM NAME            : " +item);
        System.out.println("PRICE                : " +price);
        System.out.println("QUANTITY             : " +qua);
        int total = price * qua; //calculation
        System.out.println("TOTAL PRICE          : " +total);
        System.out.println("DISCOUNT RATE        : " +disc);
        int tdisc = (total * disc / 100);
        int aftdisc = total - tdisc;
        System.out.println("PRICE AFTER DISCOUNT : " +aftdisc);
    }
    
}
