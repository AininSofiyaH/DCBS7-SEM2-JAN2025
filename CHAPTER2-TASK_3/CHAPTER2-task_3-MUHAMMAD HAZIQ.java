package chapter_2;

import java.util.Scanner;

public class task_3 {public static void main(String[] args) {
	
	int tahun_lahir_bakal_mangsa_scammer;
	int umur_mangsa_scammer;
	
	System.out.println("Hi awak,saya dariapada scammer.com nak ajak awak untuk kena scam dengan saya");
	System.out.println("tapi sebelum tu saya kena tahu awak lahir pada tahun bila ye?");
	System.out.print("KAMU: Hi,saya lahir pada tahun =");
	
	Scanner scammer = new Scanner(System.in);
	
    tahun_lahir_bakal_mangsa_scammer = scammer.nextInt();
    
    umur_mangsa_scammer = 2025 - tahun_lahir_bakal_mangsa_scammer; 
    
    System.out.println("Umur anda adalahhhhhhhh_" + umur_mangsa_scammer + " tahun");
    System.out.print("GEMPAKK TAKK HAHAHAHA MESTI TERKEJUT KANNN hihihihihihi");

}

}
