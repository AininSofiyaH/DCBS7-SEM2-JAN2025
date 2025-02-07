
import java.util.Scanner;


public class ArithmeticProg {
    public static void main(String[] args) {
    
   int x , y ;
   
   Scanner salam = new Scanner(System.in);
   System.out.print("nombor pertama yang anda ingin kira (x): ");
   x = salam.nextInt();
   
   System.out.print("nombor kedua yang anda ingin kira (y) : ");
   y = salam.nextInt();
   
   
   System.out.println("kirakira :");
   System.out.println( x +" + "+ y + " = " +(x+y));
   System.out.println( x +" - "+ y + " = " +(x-y));
   System.out.println( x +" * "+ y + " = " +(x*y));
   System.out.println( x +" / "+ y + " = " +(x/y));
   System.out.println( x +" % "+ y + " = " +(x%y));
   
   
   
   
    
    
    }
}