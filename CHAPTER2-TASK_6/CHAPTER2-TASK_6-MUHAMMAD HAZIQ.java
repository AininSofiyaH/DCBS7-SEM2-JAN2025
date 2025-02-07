package chapter_2;

import java.util.Scanner;

public class TASK_6 {public static void main(String[] args) {

	float weight , height ;
	System.out.println("***** BMI CALCULATOR *****");
	System.out.println("Please enter your weight (KG) ");
	Scanner nate = new Scanner(System.in);
	weight = nate.nextFloat() ;
	
	System.out.println("Please enter your height (M) ");
	height = nate.nextFloat() ;
	
	System.out.println("*Your BMI is = " + String.format("%2f" ,weight / (height*height)));
	System.out.println("***************************");
	
	
	
	
}
}
