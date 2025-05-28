
package chapter3;

import java.util.Scanner;

public class chapter3_task2 {public static void main(String[] args) {
	int x , y , op;
	
	Scanner amir = new Scanner(System.in);
	   System.out.print("First number (x): ");
	   x = amir.nextInt();
	   
	   System.out.print("Second number (y) : ");
	   y = amir.nextInt();
	   
	   System.out.println("1: +");
	   System.out.println("2: -");
	   System.out.println("3: *");
	   System.out.println("4: /");
	   
	   
	   System.out.print("Enter Operation : ");
	   op = amir.nextInt();
	   
	   
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