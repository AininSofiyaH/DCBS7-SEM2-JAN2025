import java.util.Scanner;

public class CHAPTER2_TASK3_NURAZREEN {
    public static void main(String[]args) {

        int tahun_sekarang , tahun_kelahiran ; // declare jenis data

        Scanner baca = new Scanner(System.in);

        System.out.println("Masukkan tahun_sekarang");
       tahun_sekarang = baca.nextInt();

        
        System.out.println("Masukkan tarikh kelahiran anda : "); //prompt untuk dapatkan age user
        tahun_kelahiran = baca.nextInt();

        tahun_kelahiran = tahun_sekarang - tahun_kelahiran ;  // nak kira umur by tolak tahun
         
        System.out.println("\n--- Maklumat user ---");
        System.out.println("\numur anda ialah: " +tahun_kelahiran + " tahun."); //nak dapat output umur user
        

 
        
        baca.close();
    }
}