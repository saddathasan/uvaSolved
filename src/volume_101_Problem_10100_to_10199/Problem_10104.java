/**
 * 
 */
package volume_101_Problem_10100_to_10199;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 */
public class Problem_10104 {

	/**
	 * @param args
	 * 
	 *  Euclid Problem
	 * 
	 */

	public static Scanner k = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		while (k.hasNextInt()) {
			int a = k.nextInt();
			int b = k.nextInt();

			int x = 0;
			int y = 1;
			int prev_x = 1;
			int prev_y = 0;

			while (b != 0) {
				int q = a/b;

				int tmp = b;
				b = a%b;
				a = tmp;

				int next_x = prev_x - q * x;
				prev_x = x;
				x = next_x;

				int next_y = prev_y - q * y;
				prev_y = y;
				y = next_y;
			}
			System.out.println(prev_x + " " + prev_y + " " + a);
		} 



	}

}
