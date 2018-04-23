/**
 * 
 */
package volume_127_Problem_12700_to_12799;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * An Interesting Game 
 *
 */
public class Problem_12751 {

	/**
	 * @param args
	 */

	public static Scanner k = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int    s , rem  ;

		int testCase = k.nextInt(); 

		for(int i=1 ; i <= testCase ; i++ ) {

			int n = k.nextInt();
			int j = k.nextInt();
			int x = k.nextInt();

			s = rem = 0 ;
			
			for(int c=0 ; c < j ; c++ ){
				rem += x ;
				x++;
			}
			s = ( n * ( n + 1 ) ) >> 1 ;
			
			System.out.printf("Case %d: %d\n",i,s-rem);
		}
	}


}


