/**
 * 
 */
package volume_103_Problem_10300_to_10399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 
 * Zeros and Ones 
 *
 */
public class Problem_10324 {

	public static InputStreamReader input = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(input);


	public static void main(String[] args) throws IOException {


		StringBuilder output = new StringBuilder("");
		String m = "";


		int cases = 1;

		while ((m = br.readLine()) != null) {

			output.append("Case ").append(cases).append(":\n");

			int n = Integer.parseInt(br.readLine());

			for (int i = 0; i < n; i++) {

				String[] str = br.readLine().split(" ");

				int x = Integer.parseInt(str[0]);
				int y = Integer.parseInt(str[1]);

				Boolean flag = false;

				for (int j = Math.min(x, y); j < Math.max(x, y); j++) {
					if (m.charAt(j) != m.charAt(j + 1)) {
						flag = true;
						break;
					}
				}

				if (flag) {
					output.append("No\n");
				} 
				else {
					output.append("Yes\n");
				}

			}
			cases++;

		}

		System.out.print(output);
	}

}