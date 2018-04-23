/**
 * 
 */
package volume_114_Problem_11400_to_11499;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Saddat Hasan
 *
 *
 *
 *Largest Prime Divisor 
 */
public class Problem_11466  {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		sieve(10001000);

		while (true) {
			long num = Math.abs(Long.parseLong(br.readLine().trim()));
			if (num == 0)
				return;

			long maxPrime = -1;
			int noOfdivisors = 0;

			for (int i = 0; i*i<=num && i < Top; i++) {
				if (num % purePrimes[i] == 0) {
					noOfdivisors++;
					maxPrime = purePrimes[i];
					while (num % purePrimes[i] == 0)
						num /= purePrimes[i];

					if (num == 1)
						break;
				}
			}

			if(num != 1){
				maxPrime = num;
				noOfdivisors++;
			}

			if (noOfdivisors > 1)
				System.out.println(maxPrime);
			else
				System.out.println("-1");

		}
	}


	static int[] purePrimes;
	static int Top;

	static boolean[] sieve(int x) {
		boolean[] primes = new boolean[x+1];
		Arrays.fill(primes, true);
		purePrimes = new int[x];
		Top = 0;


		primes[0] = false;
		primes[1] = false;
		int m = (int) Math.sqrt(x);

		for (int i = 2; i <= m ; i++) {
			if (primes[i]) {
				purePrimes[Top++] = i;
				for (int j = i * i; j < primes.length; j += i)
					primes[j] = false;
			}
		}

		for (int i = m+1; i < primes.length; i++)
			if (primes[i])
				purePrimes[Top++] = i;

		return primes;
	}


}
