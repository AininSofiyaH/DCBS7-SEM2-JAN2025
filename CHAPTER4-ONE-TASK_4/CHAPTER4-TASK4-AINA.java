/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tasklooping4;

/**
 *
 * @author aina
 */
public class Tasklooping4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sum = 0;
        
        System.out.println("Number\tPower of 2 (n^2)");//print no power of 2
        for (int i = 1; i <= 10; i++){ //syntax yg kene fulfilled untuk dibaca lalu diprint
            int square = i * i; // untuk kira n^2
            System.out.println(i + "\t" + square);
            sum += square; //sum square
        }
        
        System.out.println("\nSum of squares from 1 to 10: " + sum); //print ler sum nyer
    }
}
    
    

