/**
 * 
 */
package volume_001_Problem_100_to_199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 3:10:16 AM Sep 17, 2014
 * 
 * Factors and Factorial 
 */
public class Problem_160 {

	public static void main(String[] args) throws IOException {

		int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };

		boolean[] isPrime = new boolean[101];

		int[] factors = new int[101];

		for (int i = 0; i < primeNumbers.length; i++) {
			isPrime[primeNumbers[i]] = true;
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		while (!s.equals("0")) {

			int N = Integer.parseInt(s);

			factors = new int[101];

			for (int i = 0; i < primeNumbers.length; i++) {
				factors[primeNumbers[i]] = count(N, primeNumbers[i]);
			}

			int i = 0;
			
			System.out.printf("%3d! =", N);
			
			for (i = 0; i < primeNumbers.length && factors[primeNumbers[i]] != 0; i++) {
				if (i == 15) {
					System.out.print("\n      ");
				}
				System.out.printf("%3d", factors[primeNumbers[i]]);
			}
			System.out.println("");
			s = br.readLine();
		}
	}

	public static int count(int N, int x) {
		int count = 0;
		for (int i = x; i <= N; i *= x) {
			count += N / i;
		}
		return count;
	}

}
