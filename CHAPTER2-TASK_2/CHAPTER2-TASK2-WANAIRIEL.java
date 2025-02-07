import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Task 2: Display User Information");
        System.out.print("Enter your name: ");
        String name = read.nextLine();
        System.out.print("Enter your age: ");
        int age = read.nextInt();
        read.nextLine(); // Consume newline
        System.out.print("Enter your hobby: ");
        String hobby = read.nextLine();
        System.out.print("Enter your favorite food: ");
        String favoriteFood = read.nextLine();

        System.out.println("\nUser Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        System.out.println("Favorite Food: " + favoriteFood);
}
}