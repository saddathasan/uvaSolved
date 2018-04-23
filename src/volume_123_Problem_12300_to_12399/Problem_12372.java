/**
 * 
 */
package volume_123_Problem_12300_to_12399;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * 
 * Packing for Holidays
 *
 */
public class Problem_12372 {

	/**
	 * @param args
	 */
	
	
	public static Scanner k = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int testCase = k.nextInt();
		
		for (int i=1; i<=testCase; i++) {
			
			int a = k.nextInt();
			int b = k.nextInt();
			int c = k.nextInt();
			
			if (a>20 || b>20 || c>20) {
				System.out.println("Case "+i+":"+" bad");
			}
			else {
				System.out.println("Case "+i+":"+" good");
			}
			
			
			
		}
		
		
		
		
	}

}
