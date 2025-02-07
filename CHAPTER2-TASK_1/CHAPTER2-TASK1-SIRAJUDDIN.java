
import java.util.Scanner;


public class ArithmeticProg {
    public static void main(String[] args) {
    
   int x , y ;//set variable
   
   Scanner oreo = new Scanner(System.in);
   System.out.print("nombor pertama yang anda ingin kira (x): ");//input untuk x
   x = oreo.nextInt();
   
   System.out.print("nombor kedua yang anda ingin kira (y) : ");//input untuk y
   y = oreo.nextInt();
   
   
   System.out.println("kirakira :");//jalan kerja
   System.out.println( x +" + "+ y + " = " +(x+y));//hasil
   System.out.println( x +" - "+ y + " = " +(x-y));
   System.out.println( x +" * "+ y + " = " +(x*y));
   System.out.println( x +" / "+ y + " = " +(x/y));
   System.out.println( x +" % "+ y + " = " +(x%y));
   
   
   
   
    
    
    }
}
