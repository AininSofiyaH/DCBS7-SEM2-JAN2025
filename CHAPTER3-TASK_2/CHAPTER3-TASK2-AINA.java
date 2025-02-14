/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgswitch.task1;
import java.util.Scanner;
/**
 *
 * @author aina
 */
public class switchtask2 {
    public static void main(String[] args) {
       
        
        double num1,num2;
        Scanner Baca = new Scanner(System.in);
        
        
         System.out.println(" First Number ");
         num1 = Baca.nextDouble();
         
         System.out.println(" Second Number "); 
         num2 = Baca.nextDouble();
         
         System.out.println(" Pilih Operator: 1. tambah  2.tolak   3. darab ");
         int operation = Baca.nextInt();
         
 
         
     switch(operation){
         case 1: System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));break;
         case 2: System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));break;
         case 3: System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));break;
         case 4: System.out.println(num1 + " / " + num2 + " = " + (num1/num2));break;
         case 5: System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));break;
         
        
         
         
         
         
         default: System.out.println("Syntax error");
         
     }
         
         
         
         
         
         
         
         
         
         
        
        
    
        
}
}
