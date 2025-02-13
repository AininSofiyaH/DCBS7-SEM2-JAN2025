
package arithmeticprog;

/**
 *
 * @author Nabil Aqil
 */

import java.util.*;
public class ArithmeticProg {

    public static void main(String[] args) {
        int birth, current;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your year of birth : ");
        birth = in.nextInt();
        
        System.out.print("Enter current year : ");
        current = in.nextInt();
        
        System.out.println("Your age is : " + (current - birth));
    }
    
}
