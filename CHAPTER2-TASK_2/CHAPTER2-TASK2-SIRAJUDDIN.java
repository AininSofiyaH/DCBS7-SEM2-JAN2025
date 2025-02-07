import java.util.Scanner;

		
		{
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.print(" Enter nama penuh : ");//ask user to enter fullname
        String name = scanner.nextLine();
        System.out.print("Enter umur anda : ");//ask user to enter age
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Hobi apa?: ");//ask user to enter hobby
        String hobby = scanner.nextLine();
        System.out.print("Makanan kegemaran?: ");//ask user to enter fav food
        String favmakanan = scanner.nextLine();
    
        System.out.println("\n--- Informasi Anda ! -----");
        System.out.println("--- Name anda: " + name);//hasil
        System.out.println("--- Umur anda: " + umur);
        System.out.println("--- Hobi anda: " + hobby);
        System.out.println("--- Makanan kegemaran anda: " + favmakanan);
        
    }
}
