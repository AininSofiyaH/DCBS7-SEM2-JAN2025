package chapter2;

import java.util.Scanner;

		public class task6
		{
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in (m): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("\n--- BMI Result ---");
        System.out.printf("Wow your BMI is: %.2f%n", bmi);
        System.out.println("------------------");

    }
}
