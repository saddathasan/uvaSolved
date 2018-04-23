/**
 * 
 */
package algorithms_for_Problems;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 8:05:25 PM Sep 12, 2014
 */
public class Sieve_Algorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);

		int number = k.nextInt();

		for (int i=2; i<=number; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub

		for (int j=2; j<i; j++) {
			if (i%j == 0) {
				return false;
			}
		}

		return true;
	}


}
