/**
 * 
 */
package volume_107_Problem_10700_to_10799;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 
 * Back to Intermediate Math
 *
 */
public class Problem_10773 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws Exception {

		int testCase = Integer.parseInt(br.readLine());

		double d, v, u;

		double minTime = 0.0;
		double minDis = 0.0;

		for (int t = 1; t <= testCase; t++) {

			String[] S = br.readLine().split(" ");

			d = Double.parseDouble(S[0]);
			v = Double.parseDouble(S[1]);
			u = Double.parseDouble(S[2]);

			minTime = d / u;
			minDis = d / Math.sqrt(u * u - v * v);

			if (minTime == minDis || v >= u) {
				System.out.println("Case " + t + ": can't determine");
			}
			else {
				System.out.printf("Case %d: %.3f\n", t,
						Math.abs(minDis - minTime));

			}
		}	
	}

}
