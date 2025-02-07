import java.util.Scanner;

		
		{
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Tahun anda lahir: ");//suruh user masukkan tahunn mereka lahir
        int tahunlahir = scanner.nextInt();
        System.out.print("Tahun kini: ");//suruh user masukkan tahun terkini
        int tahunkini = scanner.nextInt();
        int umur = tahunkini - tahunlahir;
        System.out.println("\n--- MANTAP ---");
        System.out.println("Umur anda ialah ! : " + umur + " tahun");//hasil
        System.out.println("-----------------");

    }
}
