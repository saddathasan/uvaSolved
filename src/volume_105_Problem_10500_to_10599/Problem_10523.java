/**
 * 
 */
package volume_105_Problem_10500_to_10599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 *
 */
public class Problem_10523 {

	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws IOException {

		while (true) {

			String s = input.readLine();

			if (s == null) {
				break;
			}

			String[] line = s.split(" ");

			int n = Integer.parseInt(line[0]);
			int a = Integer.parseInt(line[1]);

			BigInteger big = new BigInteger("0");

			for (int i = 1; i <= n; i++) {
				
				BigInteger number = new BigInteger(""+a);
				
				number = number.pow(i);
				number = number.multiply(BigInteger.valueOf(i));
				
				big = big.add(number);
			}
			System.out.println(big.toString());
		}
	}

}
