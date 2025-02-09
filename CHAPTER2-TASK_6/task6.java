package Chapter2;

import java.util.Scanner;

public class task6 {public static void main(String[] args) {
	
	float w , h ; // create variable for weight and height	
	
	System.out.println("======== BMI Calculator ========\n"); // some designs
	System.out.print("Enter your weight (KG) = ");
	Scanner hola = new Scanner(System.in);
	w = hola.nextFloat(); // getting weight
	
	System.out.print("Enter your height (M) = ");
	h = hola.nextFloat(); // getting height
	
	System.out.println("Your BMI is = " + String.format("%.2f" ,w/(h*h))); //calculate using formula from slide
	System.out.println("\n================================");
	
	
}


}
