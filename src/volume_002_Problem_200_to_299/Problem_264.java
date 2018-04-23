/**
 * 
 */
package volume_002_Problem_200_to_299;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 */
public class Problem_264 {

	/**
	 * @param args
	 */

	public static Scanner k = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		1  while (k.hasNext()) {

			int number = k.nextInt();
			int index = number;
			int diagonal = 0;

			for (diagonal=1; index>diagonal; diagonal++) {
				index-=diagonal;
			}

			int u =  diagonal%2==0 ? index  : diagonal-index+1;
			int d = diagonal-u+1;

			System.out.printf("TERM %d IS %d/%d", number, u,d);
			
			
			
		}
	}
}
