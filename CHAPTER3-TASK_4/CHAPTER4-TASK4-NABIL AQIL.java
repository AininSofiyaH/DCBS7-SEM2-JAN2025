package javaapp;

/**
 *
 * @author Nabil
 */
import java.util.Scanner;
public class Task {
    public static void main(String[] args){
        String itemSelect = " ";
        int discount , itemPrice = 0;
        Scanner goat = new Scanner(System.in);
        
        //Display menu option
        System.out.println("============== Goat Store =============");
        System.out.println("   Welcome , Please make a selection   ");
        System.out.println(" 1. Tiramisu Choco  -----------   $5.00");
        System.out.println(" 2. Vanilla Coffee  -----------  $10.00");
        System.out.println(" 3. Dark Choco Cup  -----------  $15.00");
        System.out.println(" 4. Pumpkin Pie     -----------  $25.00");
        System.out.println(" 5. Oatmeal Special -----------  $35.00");
        System.out.println("=======================================");
        System.out.print  ("Enter your selection (1 - 5) : ");
        int MenuChoice = goat.nextInt();
        goat.nextLine();
        
        //Pick item based on selection
        switch (MenuChoice){
            case 1 : itemSelect = "Tiramisu Choco"; itemPrice = 5; break;
            case 2 : itemSelect = "Vanilla Coffee"; itemPrice = 10; break;
            case 3 : itemSelect = "Dark Choco Cup"; itemPrice = 15; break;
            case 4 : itemSelect = "Pumpkin Pie"; itemPrice = 25; break;
            case 5 : itemSelect = "Oatmeal Special"; itemPrice = 35; break;
            default : System.out.println("\nSorry , please try again\n");System.exit(0);
        }
        
        //Display available discount
        System.out.println("\nAvailable discount code :- ");
        System.out.println("FF7300 - 25% off");
        System.out.println("FF8300 - 50% off");
        System.out.println("FF9200 - 75% off");
        System.out.print("Enter your discount code (Press Enter to skip) : ");
        String d_code = goat.nextLine();
        
        //Switch for discount code
        switch (d_code){
            case "FF7300" : discount = 25; break;
            case "FF8300" : discount = 50; break;
            case "FF9200" : discount = 75; break;
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
