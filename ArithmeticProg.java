package Chapter2;

import java.util.Scanner;

public class ArithmeticProg {public static void main(String[] args) {
    
   int x , y ;
   
   Scanner salam = new Scanner(System.in);
   System.out.print("Sila masukkan nombor pertama yang anda ingin kalukulasikan (x): ");
   x = salam.nextInt();
   System.out.println("Bagus!\n");
   System.out.print("Sila masukkan nombor kedua yang anda ingin kalukulasikan (y) : ");
   y = salam.nextInt();
   System.out.println("Terbaik\n");
   
   System.out.println("Kalkulasi :");
   System.out.println( x +" + "+ y + " = " +(x+y));
   System.out.println( x +" - "+ y + " = " +(x-y));
   System.out.println( x +" * "+ y + " = " +(x*y));
   System.out.println( x +" / "+ y + " = " +(x/y));
   System.out.println( x +" % "+ y + " = " +(x%y));
   
   
   
   
}


}
