//The scanner import
import java.util.Scanner;

/**
 *
 * @author Nabil Aqil
 */
public class Task3 {
    public static void main(String[] args) {
        //Making "in" the scanner
        Scanner in = new Scanner(System.in);
        
        //Input for current year
        System.out.print("Enter the current year : ");
        int cday = in.nextInt();
        
        //Input for birth year
        System.out.print("Enter your birthyear : ");
        int bday = in.nextInt();
        in.nextLine();
        
        //Print the age
        System.out.println("\nYour age is : " + (cday - bday));
    }
}
