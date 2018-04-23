/**
 * 
 */
package volume_127_Problem_12700_to_12799;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * 
 * Patern Locker
 *
 */
public class Problem_12712 {

	/**
	 * @param args
	 */

	public static Scanner k = new Scanner(System.in);

	public static BigInteger  max = new BigInteger (10000000000007);

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int testCase = k.nextInt();

		for( int i=1 ; i<=testCase ; i++ ){

			int l = k.nextInt();
			int m = k.nextInt();
			int n = k.nextInt();


			l *= l ;

			BigInteger ret = 0 , prev = 1 ;

			for( int j = 1 ; j <= m ; j++ ) { 
				prev *= ( l-j+1 ); prev %= max ;
			}

			for( int h = m ; h <= n ; h++ ) {
				ret += prev ;
				ret %= max ;
				prev = prev * ( l - i ) ;
				prev %= max;
			}
			System.out.println("Case "+i+": "+ret);
		}
	}
}


