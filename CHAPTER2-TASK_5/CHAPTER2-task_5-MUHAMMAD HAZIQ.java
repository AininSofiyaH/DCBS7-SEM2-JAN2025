package chapter_2;

import java.util.Scanner;

public class task_5 {public static void main (String[] args) {

	String item ;
	int quantity ;
	float price , total , discount , F_Price ;
	System.out.println("*******************************");
	System.out.println("====WILLKOMMEN TO ZIOT SHOP====");
	System.out.println("*******************************");
	System.out.print("Item Name =");
	Scanner bare = new Scanner(System.in);
	item = bare.nextLine();
	
	System.out.println("\n******************************");
	System.out.print("          QUANTITY =");
	quantity = bare.nextInt();
	
	System.out.println("******************************");
	System.out.print("          PRICE =");
	price = bare.nextFloat();
	
	System.out.println("\n******************************");
	System.out.print("      DISCOUNT RATE (%) =");
	discount = bare.nextFloat();
	
	System.out.println("\n******************************");
	System.out.println("            RESULT ");
	total = quantity * price ;
	F_Price = total * ( (100 - discount) / 100 );
	
	System.out.println("\n******************************");
	System.out.println("            RESULT              ");
	
	System.out.println("*******************************");
	System.out.print("Item Name =" + item);
	
	
	System.out.println("\n******************************");
	System.out.print("          QUANTITY =" + quantity);
	
	System.out.println("******************************");
	System.out.print("        TOTAL  PRICE =" + String.format("%.2f", price));
	
	System.out.println("\n******************************");
	System.out.print("      DISCOUNT RATE (%) =" + String.format("%.2f", discount));
	
	
	System.out.println(" \n FINAL PRICE (RM) =" + String.format("%.2f", F_Price));
	System.out.println("******************************");
	
	
	

	
}
}
