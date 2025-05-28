/**
 *
 * @author haziq
 */
package chapter3;



import java.util.Scanner;
public class Chapter3_Task4 {
    public static void main(String[] args){
        String itemSelect = " ";
        int discount , itemPrice = 0;
        Scanner pisang = new Scanner(System.in);
        
        //Display menu option
        System.out.println("============== YOYOT CAFE =============");
        System.out.println("   Welcome , Please make a selection   ");
        System.out.println(" 1. Choclate  -----------   $5.00");
        System.out.println(" 2. Vanilla  -----------  $10.00");
        System.out.println(" 3. Caramel  -----------  $15.00");
        System.out.println(" 4. Cake     -----------  $25.00");
        System.out.println(" 5. Cheese Fries -----------  $35.00");
        System.out.println("=======================================");
        System.out.print  ("Enter your selection (1 - 5) : ");
        int MenuChoice = pisang.nextInt();
        pisang.nextLine();
        
        //Pick item based on selection
        switch (MenuChoice){
            case 1 : itemSelect = "Choclate"; itemPrice = 5; break;
            case 2 : itemSelect = "Vanilla"; itemPrice = 10; break;
            case 3 : itemSelect = "Caramel"; itemPrice = 15; break;
            case 4 : itemSelect = "Cake"; itemPrice = 25; break;
            case 5 : itemSelect = "Cheese Fries"; itemPrice = 35; break;
            default : System.out.println("\nSorry , please try again\n");System.exit(0);
        }
        
        //Display available discount
        System.out.println("\nAvailable discount code :- ");
        System.out.println("F80300 - 25% off");
        System.out.println("F81300 - 50% off");
        System.out.println("F82200 - 75% off");
        System.out.print("Enter your discount code (Press Enter to skip) : ");
        String d_code = pisang.nextLine();
        
        //Switch for discount code
        switch (d_code){
            case "F80300" : discount = 25; break;
            case "F81300" : discount = 50; break;
            case "F82200" : discount = 75; break;
            default : discount = 0;
        }
        
        float discountPrice = itemPrice - (itemPrice * discount / 100);
        
        //Print the receipt
        System.out.println("\n===== Receipt ======");
        System.out.println("Product : " + itemSelect);
        System.out.println("Price : $" + itemPrice + ".00");
        System.out.println("");
        System.out.println("Discount Rate : " + discount + "%");
        System.out.printf("Discounted Price : $%.2f%n", discountPrice);
    }
}