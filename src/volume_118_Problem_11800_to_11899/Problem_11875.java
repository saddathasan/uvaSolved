/**
 * 
 */
package volume_118_Problem_11800_to_11899;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * Brick Game
 * 
 *
 */
public class Problem_11875 {

	/**
	 * @param args
	 * 
	 * 
	 * 
	 */
	
	public static Scanner k = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int testCase = k.nextInt();

		for(int j = 1; j<=testCase; j++) {

			int array[] = new int [20];



			int n = k.nextInt();

			for(int i = 0; i<n; i++) {
				array [i] = k.nextInt();
			}

			int k = n/2;

			System.out.println("Case "+j+": "+array[k]);
		}

	}

}
