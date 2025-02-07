package chapter2;

import java.util.Scanner;

		public class task3
		{
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // saya menyuruh user meletakkan tarikh lahir mereka
        System.out.print("Letakkan tahun apabila anda dilahirkan di muka bumi ini: ");
        int tahunlahir = scanner.nextInt();
        
        // saya mnyuruh user meletakkan tahun kini
        System.out.print("Letakkan tahun kini: ");
        int tahunkini = scanner.nextInt();
        int umur = tahunkini - tahunlahir;
        
        // output akan memaparkan umur mereka
        System.out.println("\n--- Tahniah ! ---");
        System.out.println("Umur anda ialah ! : " + umur + " tahun");
        System.out.println("-----------------");

    }
}