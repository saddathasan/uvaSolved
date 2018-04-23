/**
 * 
 */
package volume_122_Problem_12200_to_12299;

import java.io.*;

import java.util.StringTokenizer;

/**
 * @author Saddat Hasan
 *
 *
 *
 *
 *Emoogle Balance
 */
public class Probelm_12279 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		runSolution(in, out);

		out.close();
	}

	public static void runSolution(BufferedReader in, PrintWriter out) throws IOException {
		// Loop forever
		int aCase = 1;
		while (true) {

			// Read n, quit if n == 0
			String line = in.readLine();
			StringTokenizer st = new StringTokenizer(line);
			int n = Integer.parseInt(st.nextToken());
			if (n == 0) {
				return;
			}

			// Process n integers x
			line = in.readLine();
			st = new StringTokenizer(line);
			int balance = 0;
			for (int i = 0; i < n; ++i) {
				int x = Integer.parseInt(st.nextToken());
				if (x == 0) {
					balance--;
				}
				else {
					balance++;
				}
			}

			// Print the result
			out.println("Case " + aCase + ": " + balance);

			// increment aCase for next case
			aCase++;
		}
	}

}
