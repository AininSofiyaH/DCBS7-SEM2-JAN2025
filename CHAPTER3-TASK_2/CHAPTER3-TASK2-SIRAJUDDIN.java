package chapter3;

import java.util.Scanner;

public class task2 {public static void main(String[] args) {
	int x , y , op;
	
	Scanner ajiq = new Scanner(System.in);
	   System.out.print("First number (x): ");
	   x = ajiq.nextInt();
	   
	   System.out.print("Second number (y) : ");
	   y = ajiq.nextInt();
	   
	   System.out.println("1: +");
	   System.out.println("2: -");
	   System.out.println("3: *");
	   System.out.println("4: /");
	   
	   
	   System.out.print("Enter Operation : ");
	   op = ajiq.nextInt();
	   
	   
	   switch (op) {
	   case 1:
	   System.out.println (x + " + " + y + " = " + (x + y));
	   break;
	   
	   case 2:
		   System.out.println (x + " - " + y + " = " + (x - y));
		   break;
		   
	   case 3:
		   System.out.println (x + " - " + y + " = " + (x - y));
		   break;
	   }
	   
	   
}

}
