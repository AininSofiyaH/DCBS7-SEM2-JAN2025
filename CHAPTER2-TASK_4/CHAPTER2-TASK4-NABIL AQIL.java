//The scanner import
import java.util.Scanner;

/**
 *
 * @author Nabil Aqil
 */
public class Task4 {
    public static void main(String[] args) {
        //Making "in" the scanner
        Scanner in = new Scanner(System.in);
        
        //Input for name
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        
        //Input for ID
        System.out.print("Enter your ID : ");
        String id = in.nextLine();
        
        //Input for subject
        System.out.print("Enter your subject : ");
        String subject = in.nextLine();
        
        //Input for Test 1 Marks
        System.out.print("Enter your marks for Test 1 : ");
        int test1 = in.nextInt();
        
        //Input for Test 2 Marks
        System.out.print("Enter your marks for Test 2 : ");
        int test2 = in.nextInt();
        
        //The prints
        System.out.println("\nHere is your results :-");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Subject : " + subject);
        System.out.println("Average Marks : " + ((test1 + test2)/ 2));
    }
}
