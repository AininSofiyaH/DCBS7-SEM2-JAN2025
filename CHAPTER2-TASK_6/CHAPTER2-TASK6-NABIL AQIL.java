//Importing the scanner
import java.util.Scanner;

/**
 *
 * @author Nabil Aqil
 */
public class Task6 {
    public static void main(String[] args) {
        //Making "in" the scanner
        Scanner in = new Scanner(System.in);
        
        //Input for height
        System.out.print("Enter your height : ");
        int height = in.nextInt();
        
        //Input for weight
        System.out.print("Enter your weight : ");
        int weight = in.nextInt();

        //The formula for BMI
        float BMI = weight / ((height / 100) ^ 2);
        
        //The print
        System.out.println("\nYour BMI : " + BMI);
    }
}
