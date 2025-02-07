
import java.util.Scanner;

/**
 *
 * @author Nabil Aqil
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your height : ");
        int height = in.nextInt();
        
        System.out.print("Enter your weight : ");
        int weight = in.nextInt();

        float BMI = weight / ((height / 100) ^ 2);
        System.out.println("\nYour BMI : " + BMI);
    }
}
