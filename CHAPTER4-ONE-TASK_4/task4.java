package Chapter4;

public class task4 {public static void main(String[]args) {
	int sum =0; // declare int and initialized to 0
	
	System.out.println("List of square from 1 to 10");
	for(int i = 1;i <=10;i++) {//making loop
		sum += sq(i); // adding sum with squared value of i
		
		System.out.println(i+" square is "+ sq(i));// showing each value its own square
		System.out.println("Current Sum = "+ sum+"\n"); // showing current sum to keep track
	}System.out.println("Sum of all is "+sum); // output of total sum
}
public static int sq(int y) { // method to calculate square
	return y*y;
}
}
