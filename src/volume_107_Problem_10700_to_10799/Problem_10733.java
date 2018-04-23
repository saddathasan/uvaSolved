/**
 * 
 */
package volume_107_Problem_10700_to_10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 * 
 * 
 * The Colored Cube
 * 
 * 
 */
public class Problem_10733 ksdf {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer("");

		BigInteger [] bg = new BigInteger[1001];

		for (long i = 0; i < bg.length; i++) {

			long temp=i*i;
			long temp2=temp*temp;
			
			temp=((temp2*temp)+(3*temp2)+(12*temp*i)+(8*temp))/24;
			
			bg[(int)i]=BigInteger.valueOf(temp);
		}

		while (true) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				break;
			}
			sb.append(bg[x]).append("\n");
		}
		System.out.print(sb);
	}


}
