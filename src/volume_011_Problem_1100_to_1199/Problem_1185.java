/**
 * 
 */
package volume_011_Problem_1100_to_1199;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * Big Numbers 
 *
 */
public class Problem_1185 {


	public static Scanner k = new Scanner(System.in);


	public static void main(String[] args) {

		int testCase = k.nextInt();

		for (int i = 0; i < testCase; i++) {
			
			int number = k.nextInt(); 

			// Solution Method: the number of digits in n! is log10(n!)
			// since multiplication is addition in log space, we can
			// convert log10(n!) to log10(n) + log10(n-1) + ... + log10(1)
			// and finally take the floor of the log sum + 1,
			// since log(10) = 1 and not 2 (and we want the number of digits)
			
			double numDigits = 0;
			for (int j = number; j > 1; j--) {
				numDigits += Math.log10(j);
			}

			numDigits = Math.floor(numDigits) + 1;
			
			System.out.println((int)numDigits);
		}
	}
}



