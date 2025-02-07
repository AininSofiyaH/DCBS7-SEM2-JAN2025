
import java.util.Scanner;

/**
 *
 * @author Nabil Aqil
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your product : ");
        String p_name = in.nextLine();
        
        System.out.print("Enter the price of the product : ");
        int price = in.nextInt();
        
        System.out.print("Enter the quantity of the product : ");
        int quantity = in.nextInt();
        
        System.out.print("Enter the discount rate : ");
        int d_rate = in.nextInt();
        
        int t_price = price * quantity;
        int t_price2 = t_price;
        int d_price = t_price2 - (t_price * d_rate / 100);
        
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
