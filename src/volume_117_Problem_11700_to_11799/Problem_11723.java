/**
 * 
 */
package volume_117_Problem_11700_to_11799;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * 
 * Numbering Roads
 *
 */


...................................time limit excide ..................................

public class Problem_11723 {


	public static Scanner k = new Scanner(System.in);

	public static void main(String[] args) {	

		int testCase  = 0;

		while (k.hasNext()) {

			int r = k.nextInt();
			int n = k.nextInt();

			if (r==0 && n==0) {
				break;
			}
			else {

				testCase += 1;

				int s = (r - 1)/n;

				if(s > 26) {
					System.out.println("Case "+testCase+": "+"impossible");
				}

				else {
					System.out.println("Case "+testCase+": "+s);
				}

			}


		}
	}
}


