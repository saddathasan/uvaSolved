/**
 * 
 */
package volume_001_Problem_100_to_199;

/**
 * @author Saddat Hasan
 *
 */


import java.util.Scanner;
import java.io.*;


public class Problem_100 {

	/**
	 * 3n+1 problem 
	 */
	
	
	
	
	public static void main(String[] args) throws Exception{
		
		k = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		
		while(k.hasNextInt()){
			int i = k.nextInt();
			int j = k.nextInt();
			
			int from = Math.min(i,	j);
			int to = Math.max(i, j);
			
			int max = 0;
				
			for (int i1 = from; i1<=to; i1++){
				max = Math.max(max, computeCycleLength(i1));
			}
			
			out.printf("%d %d %d\n", i, j, max);
		}
			
	}
	 
	private static int computeCycleLength(long n) {
			
		if (n==1)
				return 1;
		if (n<_MaxValue && memo[(int)n] != 0)
			return memo[(int)n];
			
		// computing length of collatz cycle 
		int len = 1 + computeCycleLength(nextCollatz(n));
		
		// storing it in cache 
		if (n<_MaxValue)
			memo[(int)n] = len;
		return len;
	}
		
	private static int _MaxValue = 1000000;
	public static int[] memo = new int[_MaxValue];
	
	private static Scanner k;
		
	public static long nextCollatz(long n){
			
		if (n%2==0)
			return n/2;
		else 
			return n*3+1;
	}
}

