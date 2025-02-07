//The scanner import
import java.util.Scanner;

/**
 *
 * @author Nabil Aqil
 */
public class Task2 {
    public static void main(String[] args) {
        //The variables
        String name, favfood, hobby;
        int age;
        Scanner in = new Scanner(System.in);
        
        //Input for name
        System.out.print("Enter your name : ");
        name = in.nextLine();
        
        //Input for age
        System.out.print("Enter your age : ");
        age = in.nextInt();
        in.nextLine();
        
        //Input for fav food
        System.out.print("Enter your favorite food : ");
        favfood = in.nextLine();
        
        //Input for hobby
        System.out.print("Enter your hobby : ");
        hobby = in.nextLine();
        
        //The prints
        System.out.println("\nHere's your stats :-");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Hobby : " + hobby);
        System.out.println("Favorite food : " + favfood);
    }
}
