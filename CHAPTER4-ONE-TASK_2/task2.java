package Chapter4;

public class task2 {public static void main(String[]args) {
	int x = 0,y = 1,z = 0;
	int sum = 0,count = 1;

	System.out.println("List sum from 1 to 10 using for loop:\n");
	for(int i = 1; i <= 10 ;i++) {//using for loop to get sum 1 to 10
		x += i;
		System.out.println("Number = " +i);
		System.out.println("Current sum = " +x+"\n");
	}
		System.out.println("====== Final sum = "+x+" ========\n");
	
	
	System.out.println("List sum from 1 to 10 using while loop:\n");
	while(y<=10) {//using while loop to get sum 1 to 10
		z += y;
			
		System.out.println("Number = " +y++);
		System.out.println("Current sum = " +z+"\n");
}
		System.out.println("====== Final sum = "+z+" =======\n");
	
	System.out.println("List sum from 1 to 10 using do while loop:\n");
	do {sum += count; // using do while loop to get sum 1 to 10
	count++;
		System.out.println("Number = " +count);
		System.out.println("Current sum = " +sum+"\n");	}while(count <= 10);
		System.out.println("====== Final sum = "+sum+" ========\n");
}	

}
