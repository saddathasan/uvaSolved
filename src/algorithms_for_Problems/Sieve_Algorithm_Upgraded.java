/**
 * 
 */
package algorithms_for_Problems;

/**
 * @author Saddat Hasan
 * 8:05:58 PM Sep 12, 2014
 */
public class Sieve_Algorithm_Upgraded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10001;

		sieve(n);


	}

	public static void sieve(int n) {
		// TODO Auto-generated method stub
		boolean isPrime[] = new boolean[n+1];

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

}
