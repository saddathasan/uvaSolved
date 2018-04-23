/**
 * 
 */
package volume_006_Problem_600_to_699;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * 
 * 500!
 *
 */
public class Problem_623 {

	public static Scanner k = new Scanner(System.in); 

	public static void main(String[] args) {

		BigInteger[] factorials = new BigInteger[1001];

		factorials[0] = BigInteger.ONE;

		for (int i = 1; i < factorials.length; i++) {
			factorials[i] = factorials[i - 1].multiply(new BigInteger(i + ""));
		}
		while (k.hasNext()) {
			int n = Integer.parseInt(k.nextLine());
			System.out.println(n + "!");
			System.out.println(factorials[n]);
		}
	}
}



