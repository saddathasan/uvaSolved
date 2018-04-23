/**
 * 
 */
package volume_101_Problem_10100_to_10199;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 9:42:33 PM Sep 22, 2014
 */
public class Problem_10168 {

	/**
	 * @param args
	 * 
	 * 
	 * Summation of Four Primes
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);

		ArrayList<Integer> primeList = new ArrayList<Integer>();

		boolean[] primeNumbers = new boolean[10000001];

		primeNumbers[0] = true;
		primeNumbers[1] = true;

		for (int i = 2; i * i < primeNumbers.length; i++) {
			if (!primeNumbers[i]) {
				for (int j = 2 * i; j < primeNumbers.length; j += i) {
					primeNumbers[j] = true;
				}
			}
		}

		for (int i = 0; i < primeNumbers.length; i++) {
			if (!primeNumbers[i]) {
				primeList.add(i);
			}
		}


		while(k.hasNext()) {
			int n = k.nextInt();

			if (n < 8) {
				System.out.println("Impossible.");
				continue;
			}
			else if (n % 2 == 0) {
				System.out.print("2 2 ");
			}
			else {
				System.out.print("2 3 ");
			}
			n = n - (2 + 2 + n % 2);

			for (int i = 0; i < primeList.size(); i++) {

				if (!primeNumbers[n - primeList.get(i)]) {
					System.out.println(primeList.get(i) + " " + (n - primeList.get(i)));
					break;
				}
			}
		}

	}

}
