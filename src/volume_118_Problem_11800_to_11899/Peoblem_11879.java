/**
 * 
 */
package volume_118_Problem_11800_to_11899;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * Multiple of 17
 *
 */
public class Peoblem_11879 {


	public static Scanner k = new Scanner(System.in);


	public static void main(String[] args) {
		
		int answer;

		while (true) {

			BigInteger number = new BigInteger(k.next());

			if (number.equals(BigInteger.ZERO)) {
				break;
			}

			if (number.mod(new BigInteger("17")).equals(BigInteger.ZERO)) {
				answer = 1;
			}
			else {
				answer = 0;
			}
			
			System.out.println(answer);
		}
	}

}


