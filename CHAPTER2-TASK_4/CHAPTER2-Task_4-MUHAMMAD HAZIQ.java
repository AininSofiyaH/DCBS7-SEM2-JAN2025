package chapter_2;

import java .util.Scanner;

public class Task_4 {public static void main(String[] args) {
	
	String Name , Id , Subject ;
	int test1 ,test2 , avg ;
	System.out.println("Sila masukkan nama student di sini");
	System.out.print("NAME:");
	Scanner nate = new Scanner(System.in);
	Name = nate.nextLine();
	
	System.out.println("Hi_" + Name);
	System.out.println("saya akan tolong kamu kirakan kamu punya markah test,");
	System.out.println("tapi boleh saya dapatkan Id kamu?");
	System.out.println("Id saya =") ;
	Id = nate.nextLine();
	
	System.out.println("Boleh saya tahu subject apa yang kamu ingin saya kirakan?");
	System.out.println("Subject : ");
	Subject = nate.nextLine();
	System.out.print("\n WOWW...Mesti susah kann?");
	
	
    System.out.println("Berapa dapat markah % untuk test 1?");
    System.out.println("First test =");
    test1 = nate.nextInt();
    
    System.out.println("Berapa dapat markah % untuk test 2?");
    System.out.println("Second test =");
    test2 = nate.nextInt();
    
    avg = ( test1 + test2 ) / 2;
    
    System.out.println("\nResult :");
    System.out.println("Average markah untuk dua test = ");
    System.out.println("==" + avg + "==");
    System.out.println("Good try bro and please study smart to get the best grade okay? ^_^ ");
    
    
    
    
	
	
	
	
}

}
