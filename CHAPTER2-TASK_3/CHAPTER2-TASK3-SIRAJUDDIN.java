import java.util.Scanner;

		public class task3
		{
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Tahun anda lahir: ");
        int tahunlahir = scanner.nextInt();
        System.out.print("Tahun kini: ");
        int tahunkini = scanner.nextInt();
        int umur = tahunkini - tahunlahir;
        System.out.println("\n--- MANTAP ---");
        System.out.println("Umur anda ialah ! : " + umur + " tahun");
        System.out.println("-----------------");

    }
}