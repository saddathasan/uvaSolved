/**
 * 
 */
package volume_113_Problem_11300_to_11399;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 *
 *
 *GCD LCM
 */
public class Problem_11388 {

	public static void main(String[] args){

		Problem_11388 gcdLcm = new Problem_11388();
		gcdLcm.begin();        

	}

	private void begin() {


		Scanner k = new Scanner(System.in);

		PrintStream ps = new PrintStream(System.out);

		int testCase = k.nextInt();

		for(int i=0; i < testCase; i++) {

			int x = k.nextInt();

			int y = k.nextInt();

			if(y%x != 0) {
				ps.printf("-1\n");
			} 
			else {
				ps.printf("%d %d\n",x,y);
			}
		}


	}

	public static long lcm(long a, long b) {                
		return((a*b)/gcd(a,b));
	}      

	public static long gcd(long a, long b) {                
		if (b==0)
			return a;
		else
			return gcd(b, a % b);
	}   

}
