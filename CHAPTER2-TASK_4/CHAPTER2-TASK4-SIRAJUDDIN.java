import java.util.Scanner;

		public class task4 
		{
   		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student's Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student's ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Subject Name: ");
        String subject = scanner.nextLine();

        System.out.print("Test 1 Marks (out of 100): ");
        double test1 = scanner.nextDouble();

        System.out.print("Test 2 Marks (out of 100): ");
        double test2 = scanner.nextDouble();

        double average = (test1 + test2) / 2;
        System.out.println("\n--- Student's Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Marks: " + average);

    }
}