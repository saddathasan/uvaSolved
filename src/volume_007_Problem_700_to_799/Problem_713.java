/**
 * 
 */
package volume_007_Problem_700_to_799;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * 
 * Adding Reversed Number 
 *
 */
public class Problem_713 {
	
	public static Scanner k = new Scanner(System.in);
	

	public static void main(String[] args) {

		

	
		BigInteger number1, number2, sum;
		
		StringBuffer sb;
		

		int testCase = k.nextInt();

		while(testCase-- > 0){
			
			sb = new StringBuffer(k.next());
			number1 = new BigInteger(sb.reverse().toString());
			
			sb = new StringBuffer(k.next());
			number2 = new BigInteger(sb.reverse().toString());

			sum = number1.add(number2);
			sb = new StringBuffer(sum.toString()).reverse();
			sum = new BigInteger(sb.toString());

			System.out.println(sum);
		}
	}

}


