/**
 * 
 */
package volume_004_Problem_400_to_499;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @author Saddat Hasan
 *
 *
 *
 *
 *Pi
 */
public class Problem_412 {

	static int counter;
	static int pairCounter;



	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//  StringBuilder out = new StringBuilder("");
		
		int n;
		int [] inp;
		int [] res;
		double ans;
		
		while((n = Integer.parseInt(br.readLine().trim())) != 0) {
			
			counter = 0;
			pairCounter = 0;
			
			inp = new int[n];
			res = new int[2];
			
			for (int i = 0; i < n; i++) {
				inp[i] = Integer.parseInt(br.readLine().trim());
			}
			
			combinations(0, 0, inp, res);
			
			if(counter != 0) { 
				ans = Math.sqrt((6.0 * (double)pairCounter) / ((double)counter*1.0));
				System.out.printf("%.6f\n", ans);
			}
		
			else {
				System.out.printf("No estimate for this data set.\n");
			}
		}
	}


	public static int GCD(int a, int b) {
		return b==0 ? a:GCD(b,a%b);
	}

	public static void combinations(int i, int j, int[] inp, int[] res) {
	
		if (i == res.length) {
			pairCounter++;
			if(GCD(res[0],res[1]) == 1) {
				counter++;
			}
		} 
		
		else if (res.length - i <= inp.length - j) {
			res[i] = inp[j];
			combinations(i + 1, j + 1, inp, res);
			combinations(i, j + 1, inp, res);
		}
	}


}
