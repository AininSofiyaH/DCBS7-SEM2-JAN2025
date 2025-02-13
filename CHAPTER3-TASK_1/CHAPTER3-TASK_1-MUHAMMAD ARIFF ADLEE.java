/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalmark;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class FinalMark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       Scanner scanner =new Scanner(System.in);
       
       System.out.println("Enter your grade: ");
       int grade = scanner.nextInt();
       
       if(grade >= 90)
           System.out.println("Congratulations! You got an A");
       else if(grade >= 70)
           System.out.println("You got a B!");
       else if(grade >= 60)
           System.out.println("You got a C!");
       else
            System.out.println("You failed!");
       
    }
    
}
