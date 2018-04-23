/**
 * 
 */
package volume_119_Problem_11900_to_11999;

/**
 * @author Saddat Hasan
 *
 *unsolved 
 */

import java.util.Scanner;

public class Problem_11984 {

	/**
	 * A Change in Thermal Unit
	 */
	
	public static Scanner k = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = k.nextInt();
		
		for (int i=1; i<=count; i++) {
			double c = k.nextInt();
			double f = k.nextInt();
			
			double change = (f*5)/9;
			
			change += c;
			
		//	double change = convert
			
			System.out.printf("Case %d: %.2f",i,change);
			
		}

	}

}
