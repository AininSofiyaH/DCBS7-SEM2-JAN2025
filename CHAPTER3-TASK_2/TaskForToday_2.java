/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class TaskForToday_2 {
    public static void main(String[] args) {
        
        //TFT 2 (Chapter 3)
        
        int num1, num2, operations;
        
        
        //sbb nnt kna masukkan user input
        Scanner read = new Scanner(System.in);
        
        System.out.println("masukkan nombor pertama: ");
        num1 = read.nextInt();  
        System.out.println("Masukkan nombor kedua: ");
        num2 = read.nextInt();
        
        //untuk switch punye
        System.out.println("  ARITHMETIC OPERATOR  ");
        System.out.println("1. Tambah \n2. Tolak \n3. Darab \n4. Bahagi");
        System.out.println("Masukkan nombor: ");
        //nombor yg dia pilih tu nnt dia tgok dekat switch tu, case num brapa
        operations = read.nextInt();

                
        switch (operations){
            
            case 1: System.out.println("Tambah:\n" +num1 + " + " +num2 + " = " +(num1 + num2));
            break;
            case 2: System.out.println("Tolak:\n" +num1 + " - " +num2 + " = " +(num1 - num2));
            break;
            case 3: System.out.println("Darab:\n" +num1 + " x " +num2 + " = " +(num1 * num2));
            break;
            case 4: System.out.println("Bahagi:\n" +num1 + " / " +num2 + " = " +(num1 / num2));
            break;
            default:System.out.println("INVALID NUMBER. ERROR.");
            break;
        }
    }
    
}
