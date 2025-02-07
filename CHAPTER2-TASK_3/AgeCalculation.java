/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agecalculation;
import java.util.Scanner;
/**
 *
 * @author sammy
 */
public class AgeCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cyear, byear, year;
       
       
       Scanner read = new Scanner(System.in);
       System.out.println("PLEASE ENTER CURRENT YEAR : ");
       cyear = read.nextInt();
       System.out.println("PLEASE ENTER BIRTH YEAR : ");
       byear = read.nextInt();
       
       read.close();
       
       year = cyear - byear;
      
       System.out.println("YOUR AGE IS : " +year +" YEARS OLD ");
               }
    
}
