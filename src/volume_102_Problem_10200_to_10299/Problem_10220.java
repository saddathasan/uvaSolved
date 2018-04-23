/**
 * 
 */
package volume_102_Problem_10200_to_10299;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 */
public class Problem_10220 {

	/**
	 * @param args
	 * 
	 * I Love Big Numbers 
	 * 
	 */


	public static Scanner k = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum[] = new int[1010];

		BigInteger factorial = BigInteger.ONE;

		for (int i = 1; i <= 1000; i++) {

			factorial = factorial.multiply(BigInteger.valueOf(i));

			String value = factorial.toString();

			for (int j = 0; j < value.length(); j++) {
				sum[i] += value.charAt(j) - '0';
			}
		}


		while (k.hasNext()) {
			System.out.println(sum[k.nextInt()]);
		}




	}

}
