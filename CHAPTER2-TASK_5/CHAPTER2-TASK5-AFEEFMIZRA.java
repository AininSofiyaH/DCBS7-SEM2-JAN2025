package chapter2;

import java.util.Scanner;

		public class task5 
		{
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter Item Name: ");
        String item = scanner.nextLine();

        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter Discount Rate (as a percentage): ");
        double discountrate = scanner.nextDouble();

        double totalprice = price * quantity;
        double disc = totalprice * (discountrate / 100);
        double finalPrice = totalprice - disc;

        System.out.println("\n--- Your reciept  ---");
        System.out.println("Item name: " + item);
        System.out.println("Price: RM" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total price: RM" + totalprice);
        System.out.println("Discount rate: " + discountrate + "%");
        System.out.println("Price after discount: RM" + finalPrice);
        System.out.println("---------------------");

    }
}
