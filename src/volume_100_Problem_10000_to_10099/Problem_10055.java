/**
 * 
 */
package volume_100_Problem_10000_to_10099;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 3:08:06 AM Sep 7, 2014
 * 
 * Hasmat the brave warrior
 * 
 */
public class Problem_10055 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);

		while(k.hasNext()) {

			long a = k.nextLong();
			long b = k.nextLong();

			if (a>b) {
				System.out.println(a-b);
			}
			else {
				System.out.println(b-a);
			}

		}

	}

}
