package Chapter4;

public class task3 {public static void main(String[]args) {
	int sumO =0,sumE =0;//declaring integers
	System.out.println("List of odd number :");
	for(int i = 1;i <= 10;i++) {//using for loop for 1 to 10
		if(i % 2 != 0) {//finding odd number
		
			sumO += i;//summing the odd value
			System.out.println(i);
		}
		else {}}
	
	System.out.println("\nList of even number :");
	
	for(int i = 1;i <= 10;i++) {//loop for 1 to 10
		if(i % 2== 0) { //finding the even number
			
			sumE += i;// storing sum even value
			System.out.println(i);
			}
			else {}
		
	}
	System.out.println("\nSum Even = "+sumE); // outputt
	System.out.println("Sum Odd = "+sumO);
}

}
