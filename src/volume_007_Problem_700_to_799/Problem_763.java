/**
 * 
 */
package volume_007_Problem_700_to_799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 * 
 * Fibinary Numbers
 * 
 *
 */
public class Problem_763 {


	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	public static BigInteger[] fib = new BigInteger[120];

	public static void main(String[] args) throws IOException {


		fib[0] = BigInteger.ONE;

		fib[1] = new BigInteger("2");

		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1].add(fib[i - 2]);
		}

		boolean first = true;

		while (input.ready()) {

			if (!first) {
				System.out.println();
			}

			first = false;

			String f1 = input.readLine();
			String f2 = input.readLine();

			if (input.ready()) {
				input.readLine();
			}

			BigInteger res = new BigInteger("0");

			for (int i = f1.length() - 1, j = 0; i >= 0; i--, j++) {
				if (f1.charAt(i) == '1')
					res = res.add(fib[j]);
			}

			for (int i = f2.length() - 1, j = 0; i >= 0; i--, j++) {
				if (f2.charAt(i) == '1')
					res = res.add(fib[j]);
			}

			int high = 120;
			int low = 0;
			int start;

			while (high - low > 1) {
				int mid = (high + low) / 2;
				if (fib[mid].compareTo(res) < 0)
					low = mid;
				else
					high = mid;
			}

			if (res.compareTo(fib[high]) >= 0) {
				start = high;
			}
			else {
				start = low;
			}

			String output = "";

			for (int i = start; i >= 0; i--) {
				if (res.compareTo(fib[i]) >= 0) {
					output = output + "1";
					res = res.subtract(fib[i]);
				} else
					output = output + "0";
			}
			System.out.println(output);

		}
	}
}


