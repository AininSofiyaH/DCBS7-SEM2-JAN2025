import java.util.Scanner;

public class CHAPTER2TASK2NURAZREEN {
    public static void main(String[]args) {

        Scanner baca = new Scanner(System.in);

        System.out.println("Masukkan Your Name : "); // prompt untuk dapatkan nama user
        String Name = baca.nextLine(); 

        System.out.println("Masukkan Your Age : "); //prompt untuk dapatkan age user
        String Age = baca.nextLine();

        System.out.println("Masukkan Your Hobby : "); //prompt untuk dapatkan hobby user
        String Hobby = baca.nextLine();

        System.out.print("Enter your favorite food: ");
        String favoriteFood = baca .nextLine();
        
        System.out.println("\n--- User Information ---");  // Displaying user input
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Hobby: " + Hobby);
        System.out.println("Favorite Food: " + favoriteFood);
        
        baca.close();
    } 
}