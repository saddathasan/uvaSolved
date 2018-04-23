/**
 * 
 */
package volume_114_Problem_11400_to_11499;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 */
public class Problem_11417 {

	/**
	 * @param args
	 * 
	 * 
	 * GCD
	 */

	public static Scanner k = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (k.hasNext()) {

			long number = k.nextLong();

			long G=0;

			if (number == 0) {
				break;
			}

			else {

				for(long i=1; i<number; i++) {

					for(long j=i+1; j<=number; j++) {

						G+=GCD(i,j);

					}
				}
			}
			
			System.out.println(G);

		}

	}


	public static long GCD(long a, long b) {
		return b==0 ? a:GCD(b,a%b);
	}

}
