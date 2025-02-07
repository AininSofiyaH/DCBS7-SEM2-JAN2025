package chapter_2;

import java.util.Scanner;

public class ArithmeticProg { public static void main(String []args){
	
	int x , y;
	
	Scanner botok = new Scanner(System.in);
	System.out.print("Sila masukkan nombor yang paling anda ingin kami kirakan (x):");
	x = botok.nextInt();
	System.out.println("Sehr Gut\n");
	System.out.print("Sila masukkan nombor yang paling anda ingin kami kirakan (y):");
	y = botok.nextInt();
	System.out.println("Sehr Sehr Gut\n");
	
	System.out.println("Calculation:");
	System.out.println( x +" + "+ y + " = " +(x+y));
	System.out.println( x +" - "+ y + " = " +(x-y));
	System.out.println( x +" * "+ y + " = " +(x*y));
	System.out.println( x +" / "+ y + " = " +(x/y));
	System.out.println( x +" % "+ y + " = " +(x%y));
	
	System.out.println("DANKEE \n");
}

}
