/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg1;
import java.util.Scanner;
/**
 *
 * @author aina
 */
public class TASK1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner Baca = new Scanner(System.in);
        
        //Instruction masukkan nilai first and second
        System.out.print("Enter nilai pertama: ");
        int num1 = Baca.nextInt();
        
        System.out.print("Enter nilai kedua: ");
        int num2 = Baca.nextInt();
        System.out.println("\n Hasilnya :"); 
        
        //formula dan instruction
        int sum = num1 + num2; //formula sum
        System.out.println(num1 + " + " + num2 + " = " + sum); //nak print sum dia
        
        int difference = num1 - num2;//formula tolak
        System.out.println(num1 + " - " + num2 + " = " + difference); //nak print subraction
        
        int product = num1 * num2; //formula darab
        System.out.println(num1 + " * " + num2 + " = " + product); //print multiplication
        
        int division =  num1 / num2;//formula bahagi
        System.out.println(num1 + " / " + num2 + " = " + division);//print division
            
        int modulus = num1 % num2; //formula modulus
        System.out.println(num1 + " % " + num2 + " = " + modulus); //print modulus
            
    }
            
    }