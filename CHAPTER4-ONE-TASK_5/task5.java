package Chapter4;

public class task5 {public static void main(String[]args) {
	for(int i = 9;i >=1 ;i--) {//starting with 9 minus 1 if more than or equal to 1
		System.out.print(times(i)+" ");//print i but undergo method of times
	}
}
public static int times(int y) {//making method where we multiply by 11
	return y * 11 ;
}
}
