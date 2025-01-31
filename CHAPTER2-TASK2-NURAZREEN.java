import java.util.Scanner;

public class user
{
    public static void main(String[]args) {

        Scanner baca = new Scanner(System.in);

        System.out.println("Masukkan Your Name : "); // prompt untuk dapatkan nama user
        String Name = baca.nextLine(); 

        System.out.println("Masukkan Your Age : "); //prompt untuk dapatkan age user
        String Age = baca.nextLine();

        System.out.println("Masukkan Your Hobby : "); //prompt untuk dapatkan hobby user
        String Hobby = baca.nextLine();

        System.out.println("Masukkan your favorite food: ");
        String favoriteFood = baca.nextLine();
        
        // Displaying the user’s input
        System.out.println("\n--- Maklumat user ---");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Hobby: " + Hobby);
        System.out.println("Favorite Food: " + favoriteFood);
        
        baca.close();
    }
}