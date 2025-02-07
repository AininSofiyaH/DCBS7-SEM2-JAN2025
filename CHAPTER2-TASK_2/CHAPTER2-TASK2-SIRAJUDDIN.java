import java.util.Scanner;

		
		{
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter nama penuh : ");
        String name = scanner.nextLine();
        System.out.print("Enter umur anda : ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Hobi apa?: ");
        String hobby = scanner.nextLine();
        System.out.print("Makanan kegemaran?: ");
        String favmakanan = scanner.nextLine();
    
        System.out.println("\n--- Informasi Anda ! -----");
        System.out.println("--- Name anda: " + name);
        System.out.println("--- Umur anda: " + umur);
        System.out.println("--- Hobi anda: " + hobby);
        System.out.println("--- Makanan kegemaran anda: " + favmakanan);
        
    }
}
