/**
 * 
 */
package volume_127_Problem_12700_to_12799;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * 
 * GCD The Largest
 *
 */
public class Problem_12708 {


	public static Scanner k = new Scanner(System.in);



	public static void main(String []args) {

		int testCase = k.nextInt();




		for (int i=1; i<=testCase; i++) {

			long number = k.nextLong();

			if(number%2!=0){
				number--;
			}

			System.out.println(number/2);
		}


	}

}
