/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchtask1;
import java.util.Scanner;
/**
 *
 * @author aina
 */
public class Switchtask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        int Markah;
        String Gred;
        
        Scanner Baca = new Scanner(System.in);
        
        System.out.println("Masukkan markah anda : ");
        Markah = Baca.nextInt();
        
        if (Markah >= 85) //syarat dia
        System.out.println("Gred Cemerlang"); //print out kalau markah is more or equal to 85
        
        else if(Markah >= 70)
        System.out.println("Gred Memuaskan"); //print output kalau gred lebih or equal to 70
        
        else if(Markah >= 50)
        System.out.println("Gred Lulus");
        
        else if(Markah < 50)
        System.out.println("Gagal");
       
              
        Baca.close();
        
        
        
        
    }
    
}
