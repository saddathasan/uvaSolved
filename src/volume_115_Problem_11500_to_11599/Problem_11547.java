/**
 * 
 */
package volume_115_Problem_11500_to_11599;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 2:43:21 AM Sep 7, 2014
 * 
 * Automatic Answer
 */
public class Problem_11547 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);

		int testCase = k.nextInt();

		for (int i=1; i<=testCase; i++) {
			int n = k.nextInt();

			int number = Math.abs((((n*63)+7492)*5)-498);
			
			System.out.println((number/10)%10);
		}
	}

}
