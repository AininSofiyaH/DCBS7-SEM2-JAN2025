import java.util.Scanner;

		public class task4 
		{
   		public static void main(String[] args) {
        Scanner abu = new Scanner(System.in);

        System.out.print("Enter Student's Name: ");
        String name = abu.nextLine();

        System.out.print("Enter Student's ID: ");
        String id = abu.nextLine();

        System.out.print("Enter Subject Name: ");
        String subject = abu.nextLine();

        System.out.print("Test 1 Marks (out of 100): ");
        double test1 = abu.nextDouble();

        System.out.print("Test 2 Marks (out of 100): ");
        double test2 = abu.nextDouble();

        double average = (test1 + test2) / 2;
        System.out.println("\n--- Student's Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Marks: " + average);

    }
}
