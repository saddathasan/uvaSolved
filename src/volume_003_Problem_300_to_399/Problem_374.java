/**
 * 
 */
package volume_003_Problem_300_to_399;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 */
public class Problem_374 {

	
	public static Scanner k = new Scanner(System.in);

	public static void main(String[] args) {

		while (k.hasNext()) {

			BigInteger b = k.nextBigInteger();
			BigInteger p = k.nextBigInteger();
			BigInteger m = k.nextBigInteger();
			
			
			
			BigInteger result = b.modPow(p, m);
			
			System.out.println(result);





		}




	}

	
}
