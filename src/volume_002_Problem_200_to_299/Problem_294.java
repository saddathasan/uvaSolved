/**
 * 
 */
package volume_002_Problem_200_to_299;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 
 * 
 * Divisors
 *
 */
public class Problem_294 {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		StringBuffer sb = new StringBuffer("");
		int cases=Integer.parseInt(br.readLine());
		for(int iz=0;iz<cases;iz++) {
			String[] str = br.readLine().split(" ");
			long x = Long.parseLong(str[0]);
			long y = Long.parseLong(str[1]);

			long max = -1, indexP = -1;
			for (long i = x; i < y + 1; i++) {
				long counter = 0;
				for (int j = 1; j * j < i + 1; j++) {

					if (i % j == 0) {
						counter++;
						if (j *j!= i) {
							counter++;
						}
					}
				}
				if (max < counter) {
					indexP = i;
					max = counter;
				}
			}
			sb.append("Between ").append(x).append(" and ").append(y).append(", ")
			.append(indexP).append(" has a maximum of ")
			.append(max).append(" divisors.\n");
		}
		System.out.print(sb);
	}

}
