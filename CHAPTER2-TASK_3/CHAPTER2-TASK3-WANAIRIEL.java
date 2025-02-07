import java.util.Scanner;
import java.time.Year;

public class TASK3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Task 3: Age Calculator");
        System.out.print("Enter your birth year: ");
        int birthYear = read.nextInt();
        int currentYear = Year.now().getValue();
        int calculatedAge = currentYear - birthYear;

        System.out.println("Your calculated age is: " + calculatedAge + " years");
}
}