import java.util.Scanner;

		public class task6
		{
		public static void main(String[] args) {
        Scanner abu = new Scanner(System.in);

        System.out.print("Berat anda  (kg): ");
        double weight = abu.nextDouble();
        System.out.print("Tinggi anda (m): ");
        double height = abu.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("\n--- BMI Result ---");
        System.out.printf("BMI anda: %.2f%n", bmi);
        System.out.println("------------------");

    }
}
