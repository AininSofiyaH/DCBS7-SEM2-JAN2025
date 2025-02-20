package Chapter3;

import java.util.Scanner;

		public class task2 {
		public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // saya menyuruh user utk memilih arithmetric operation yg hendak digunakan
        System.out.println("[Select an arithmetic operation:]");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (÷)");
        System.out.println("5. Modulus (%)");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();
        
        // saya menyuruh user meletakkan nombor pertama dan kedua untuk dikalkulasikan
        System.out.print("Enter first number: ");
        double pikachu = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double charizard = scanner.nextDouble();
        
        // ini merupakan hasil kalkulasi mengikut pilihan yang dipilih oleh user ii yg cemerlang
        switch (choice) {
            case 1:
            	 System.out.print("the result is: " + pikachu  + "+" + charizard + "=" +  (pikachu + charizard));
                break;
            case 2:
            	 System.out.print("the result is: " + pikachu  + "-" + charizard + "=" +  (pikachu - charizard));
                break;
            case 3:
            	System.out.print("the result is: " + pikachu  + "*" + charizard + "=" +  (pikachu * charizard));
                break;
            case 4:
                if (charizard != 0) { // jikalau user meletakkan no. keduanya selain 0, ini adalah hasil outputnya
                System.out.print("the result is: " + pikachu  + "/" + charizard + "=" +  (pikachu / charizard));
                } else { // dan ini merupakan hasil output jikalau user meletakkan nombor keduanya 0
                    System.out.println("ko ni pon, mana boleh bahagi dengan 0 ");              
                }
                break;
            case 5: // sama seperti pembahagian, jikalau user meletakkan no. keduanya selain 0, ini adalah hasil outputnya
                if (charizard != 0) {
                	System.out.print("the result is: " + pikachu  + "%" + charizard + "=" +  (pikachu % charizard));
                } else { // dan ini merupakan hasil output jikalau user meletakkan nombor keduanya 0
                    System.out.println("jangan letak no.2 kedua 0 lagi eh kalau taknak error");
                }
                break;
            default:
                System.out.println("orang dah bagi pilihan 1 sampai 4 ko menggatal nak letak bende lain (PILIH NOMBO 1 HINGGA 5 JE!!)");
              
        }}}
        
       
        
        
        
    
