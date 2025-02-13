/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1.statement;
import java.util.Scanner;
/**
 *
 * @author sufi
 */
public class Task1Statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        
        System.out.print("Markah akhir: ");
        int markah = mark.nextInt();
        
        String grade;
        if (markah >= 70 ){
            System.out.println("A");}
        else if (markah >=60 ){
            System.out.println("B");}
        else if (markah >=50 ){
           System.out.println("C");}
        else if (markah >=40 ){
          System.out.println("D");}
        else{
            System.out.println("GAGAL");
        }
                
    }
    
}
