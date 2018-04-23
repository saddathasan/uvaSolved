/**
 * 
 */
package algorithms_for_Problems;

/**
 * @author Saddat Hasan
 * 8:04:51 PM Sep 12, 2014
 */
public class Prime_Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10001;
		//inclusive

		sieve(n);


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

	public static void sieve(int n) {
		// TODO Auto-generated method stub
		boolean isPrime[] = new boolean[n+1];

		isPrime[0]=true;
		isPrime[1]=true;
		//int limit = (int)Math.sqrt(n);

		int limit = (int)Math.sqrt(n);
		for(int i=3; i<=limit; i+=2) {

			if (isPrime[i] == false) {

				for(int j=i*i; j<=n; j+=2*i) {

					isPrime[j] = true;    }
			}
		}



		int count =1;
		System.out.println(2);
		for (int i=3; i<isPrime.length; i+=2) {
			if (isPrime[i] == false) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("\nTotal number of primes is: "+count);

	}

	public static void prime_factor(int number) {

		sieve(number);

		for (int i=2; i*i<=number; i++) {
			if (isPrime(number)) {
				break;
			}
			if (isPrime(number) == true) {
				System.out.println("test "+i);
			}
			while (number%i == 0) {
				System.out.println(i);
				number = number/i;
			}
		}
		if (isPrime(i)) {
			System.out.println(i);
		}
	}

}
