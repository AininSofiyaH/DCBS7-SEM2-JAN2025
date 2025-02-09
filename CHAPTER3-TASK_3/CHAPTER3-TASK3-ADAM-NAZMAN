package Chapter3;


import java.util.Scanner;

public class task3 {public static void main(String[] args) {
	
	String item, cc ; // naming some variable
	int quant ;
	float price , total ,  Fprice , disc; //using float instead of integers because price normally showed in 2 decimal
	System.out.println("=============================="); // some design to look cool ig
	System.out.print("Item Name = ");
	Scanner hola = new Scanner(System.in); // setting the scanner
	item = hola.nextLine(); // getting the value of item
	
	System.out.println("==============================");
	System.out.print("Quantity = ");
	quant = hola.nextInt(); // getting value for the quantity
	
	System.out.println("==============================");
	System.out.print("Price (RM)= ");
	price = hola.nextFloat(); // same goes for price
	hola.nextLine();
	System.out.println("==============================");
	System.out.println("Colour Code Discount : ");
	System.out.println("#FF00FF = 25%");
	System.out.println("#c8a2c8 = 50");
	System.out.println("#FF00FA = 100%");
	System.out.print("Enter Colour Code = #");
	cc = hola.nextLine(); // and discount rate
	
	switch(cc) {
	case "FF00FF":
		disc = 25;
		break;
	case "c8a2c8":
		disc = 50;
		break;
	case "FF00FA":
		disc = 100;
		break;
	default:
		disc = 0;
	}
	
	
	
	System.out.println(cc);
	System.out.println("==============================\n");
	System.out.println("            Result            \n");
	total = quant * price; // simple calculation to get total price
	Fprice = total * ((100 - disc)/100); // simple calculation to get the discounted price
	
	System.out.println("=============================="); // showing all the variable value 
	System.out.print("Item Name = " + item);
	System.out.println("\n==============================");
	System.out.print("Quantity = " + quant);
	System.out.println("\n==============================");
	System.out.print("Price per unit (RM) = " + String.format("%.2f", price));
	System.out.println("\n==============================");
	System.out.print("Total price (RM) = " + String.format("%.2f", total)); // using String format because it works like C language
	System.out.println("\n==============================");
	System.out.print("Discount rate (%) = " + String.format("%.2f", disc) + "\n"); // this format was shown in the slides
	System.out.print("Color code = #" + cc);
	System.out.println("\n==============================");
	System.out.print("Final price (RM) = " + String.format("%.2f", Fprice)); // main result of the code the final price
	System.out.println("\n==============================");

}
}
