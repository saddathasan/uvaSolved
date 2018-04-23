/**
 * 
 */
package volume_116_Problem_11600_to_11699;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 3:45:00 AM Sep 7, 2014
 * 
 * Etruscan Warriors Never Play Chess
 */
public class Problem_11614 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
		
		int testCase = k.nextInt();
		
		for (int i=0; i<testCase; i++) {
			long sum = k.nextLong();
			
			long number = (long)((-1+Math.sqrt(1+8*sum))/2.0);
			
			System.out.println(number);
		}

	}

}
