/**
 * 
 */
package volume_109_Problem_10900_to_10999;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * Parity
 *
 */
public class Problem_10931 {

	public static Scanner k = new Scanner(System.in);

	public static void main(String args[]) {

		while(true) {
			
			BigInteger number = k.nextBigInteger();
			
			if(number.compareTo(BigInteger.ZERO) == 0) {
				break;
			}
			
			String s = number.toString(2);
			
			int count = 0;
			
			for(int i = 0;i<s.length();i++) {
				if(s.charAt(i) == '1')  count++;
			}
			
			System.out.println("The parity of "+ s + " is "+ count + " (mod 2)."); // output Line
			
		}
	}
}




