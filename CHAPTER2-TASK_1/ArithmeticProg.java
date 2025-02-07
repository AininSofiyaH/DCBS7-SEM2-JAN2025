/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticprog;

import java.util.Scanner;
       
/**
 *
 * @author qistina
 */
public class ArithmeticProg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Enter the first integer : ");
        num1 = baca.nextInt();
        
        System.out.print("Enter the second integer : ");
        num2 = baca.nextInt();
        
        System.out.print("1. Tambah = ");
        System.out.println(num1 + num2);
        System.out.print("2. Tolak = ");
        System.out.println(num1 - num2);
        System.out.print("3. Darab = ");
        System.out.println(num1 * num2);
        System.out.print("4. Bahagi = ");
        System.out.println(num1 / num2);
        System.out.print("5. Modulus = ");
        System.out.println(num1 % num2);
        
            
    }
    
}

