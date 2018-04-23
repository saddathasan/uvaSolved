/**
 * 
 */
package volume_101_Problem_10100_to_10199;

/**
 * @author Saddat Hasan
 *
 */

import java.util.Scanner;


public class Problem_10110 {

	
	/**
	 * Light more Light
	 */
	
	public static Scanner k = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		while (k.hasNext()) {
			
			long n = k.nextLong();
			
			if (n != 0) {
				double s = Math.sqrt(n);
				//System.out.println(s);
				long f = (long)s;
				//System.out.println(f);
				
				//System.out.println(s-f);
				
				if (s-f ==0) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}
			}
			else break;
			
		}
		
		
	}

}
