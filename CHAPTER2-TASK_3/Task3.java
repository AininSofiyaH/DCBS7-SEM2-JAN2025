/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3;
import java.util.Scanner;
/**
 *
 * @author aina
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
         int birthYear, currentYear, age; //declare int
        
         Scanner Baca = new Scanner(System.in);
         System.out.print("State tahun lahir : "); //intruction untuk enter tarikh lahir
         birthYear = Baca.nextInt();
         currentYear = 2025; 
         age = currentYear - birthYear; //formula untuk kira age user
         System.out.println("age = " + currentYear  + "-" + birthYear + " = " + age); //instruction untuk kira age
         
        
        System.out.println("Awak berumur " + age + " tahun wow."); //output akan menunjukkan umur user
        Baca.close();
    }
}