/**
 * 
 */
package volume_112_Problem_11200_to_11299;

import java.util.Scanner;

/**
 * @author Dr. Zola
 * 23:39:01 11 Jul 2015
 */
public class Problem_11246 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);

		int tesCase = k.nextInt();
		
		for (int i = 0; i<tesCase; i++) {
			
			int n = k.nextInt();
			int m = k.nextInt();
			
			int result = subset(n,m);
			
			System.out.println(result);
			
		}

	}

	private static int subset(long n, long m) {
		// TODO Auto-generated method stub
		
		int result=0;
		  for(int i=1;i<=n;i=-i)
		  {
		    result+=n*i;
		    n/=m;
		  }
		
		
		return result;
	}

}
