/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tasklooping3;

/**
 *
 * @author aina
 */
public class Tasklooping3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sum_Even = 0, sum_Odd = 0;
        
        System.out.println("Even numbers 1 - 10:");
        for (int i = 1; i <= 10; i++){  //syntax diaa is i start dari satu,baca sampai no less than 10,ade increment so tambah no
            if (i % 2 == 0){           //condition nak check if no i is even ke tak
                System.out.print(i + " ");//kalau even print
                sum_Even += i; //add to sum 
            }
        }
        System.out.println("\nSum of even numbers: " + sum_Even); //print sum of even no
        
        System.out.println("\nOdd numbers from 1 until 10:");
        for (int i = 1; i <= 10; i++){ //syntax kene fulfilled
            if (i % 2 != 0){ //check if either odd no ke x
                System.out.print(i + " "); //kalau ya print
                        sum_Odd += i; //add to sum
            }
        }
        System.out.println("\nSum of odd numbers: " + sum_Odd); //print sum of odd no
        
    }
    
}
    
    

