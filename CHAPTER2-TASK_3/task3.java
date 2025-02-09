package Chapter2;

import java.util.Scanner;

public class task3 {public static void main(String[] args) {
	
	int angka_lahir_si_pengguna;  // kat sini kite set dua variable satu for tahun lahir
	int umur_si_pengguna;	 	  // satu lagi untuk umur
	
	System.out.println("Mesin peneka umur \n");
	System.out.print("Tahun lahir saya = "); // explain the instruction for the user kat sini
	
	Scanner magis = new Scanner(System.in);
	
	angka_lahir_si_pengguna = magis.nextInt(); // store kan value int tahun lahir kt sini untuk calculate
	
	umur_si_pengguna = 2025 - angka_lahir_si_pengguna; // simple calculation to get the age of the user
	 
	System.out.println("\nJENG JENG JENG umur anda adalah " + umur_si_pengguna + " tahun"); // out put yang menceriakan hidup saya
} 

}
