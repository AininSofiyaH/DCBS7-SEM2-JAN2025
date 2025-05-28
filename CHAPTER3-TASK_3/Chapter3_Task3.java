package chapter3;
import java.util.Scanner;

/**

 */
public class Chapter3_Task3 {
    public static void main(String[] args) {
        //Discount rate variable
        int d_rate;
        
        //Making "pisang" the scanner
        Scanner pisang = new Scanner(System.in);
        
        //Input for product name
        System.out.print("Enter your product : ");
        String p_name = pisang.nextLine();
        
        //Input for price of product
        System.out.print("Enter the price of the product : ");
        int price = pisang.nextInt();
        
        //Input for quantity of product
        System.out.print("Enter the quantity of the product : ");
        int quantity = pisang.nextInt();
        pisang.nextLine();
        
        //Input for discount code %
        System.out.println("\nAvailable discount code :- ");
        System.out.println("FF7300 - 25% off");
        System.out.println("FF8300 - 50% off");
        System.out.println("FF9200 - 75% off");
        System.out.print("Enter your discount code (Press Enter to skip) : ");
        String d_code = pisang.nextLine();
        
        //Switch for discount code
        switch (d_code){
            case "FF7300" : d_rate = 25; break;
            case "FF8300" : d_rate = 50; break;
            case "FF9200" : d_rate = 75; break;
            default : d_rate = 0;
        }
        
        //The formular
        int t_price = price * quantity;
        int t_price2 = t_price;
        int d_price = t_price2 - (t_price * d_rate / 100);
        
        //The print
        System.out.println("\n------ Receipt -----");
        System.out.println("Product : " + p_name);
        System.out.println("Price : $" + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total Price : $" + t_price);
        System.out.println("");
        System.out.println("Discount Rate : " + d_rate + "%");
        System.out.println("Discounted Price : $" + d_price);
    }
}