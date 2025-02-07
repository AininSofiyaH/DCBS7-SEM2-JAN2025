
import java.util.Scanner;

/**
 *
 * @author Nabil Aqil
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        
        System.out.print("Enter your ID : ");
        String id = in.nextLine();
        
        System.out.print("Enter your subject : ");
        String subject = in.nextLine();
        
        System.out.print("Enter your marks for Test 1 : ");
        int test1 = in.nextInt();
        
        System.out.print("Enter your marks for Test 2 : ");
        int test2 = in.nextInt();
        
        
        System.out.println("\nHere is your results :-");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Subject : " + subject);
        System.out.println("Average Marks : " + ((test1 + test2)/ 2));
    }
}
