/**
 * 
 */
package volume_118_Problem_11800_to_11899;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Saddat Hasan
 * 
 * Maximum GCD
 * 
 * 
 *
 */
public class Problem_11827 {

	public static InputStreamReader input = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(input);


	public static void main(String[] args) throws IOException {

		StringBuffer sb = new StringBuffer("");
		String m = "";

		int cases = Integer.parseInt(br.readLine());

		for (int i = 0; i < cases; i++) {

			StringTokenizer str= new StringTokenizer(br.readLine());

			int[] x = new int[str.countTokens()];

			for(int j=0;j<x.length;j++){
				x[j]=Integer.parseInt(str.nextToken());
			}

			int max=Integer.MIN_VALUE;

			for(int j=0;j<x.length;j++) {
				for(int k=j+1;k<x.length;k++) {
					max=Math.max(GCD(x[j],x[k]),max);
				}
			}
			sb.append(max).append("\n");
		}
		System.out.print(sb);
	}

	static int GCD(int x, int y) {
		if (y == 0) {
			return x;
		}
		return GCD(y, x % y);
	}
}

