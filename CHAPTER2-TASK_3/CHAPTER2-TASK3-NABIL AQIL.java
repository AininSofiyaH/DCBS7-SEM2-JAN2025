
import java.util.Scanner;

/**
 *
 * @author Nabil Aqil
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the current year : ");
        int cday = in.nextInt();
        
        System.out.print("Enter your birthyear : ");
        int bday = in.nextInt();
        in.nextLine();
        
        System.out.println("\nYour age is : " + (cday - bday));
    }
}
