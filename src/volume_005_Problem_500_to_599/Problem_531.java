/**
 * 
 */
package volume_005_Problem_500_to_599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Saddat Hasan
 *
 *Compromise
 *
 */
public class Problem_531 {

	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	


	public static void main(String[] args) throws IOException {

		while (true) {

			String line = input.readLine();

			if (line == null) {
				break;
			}

			ArrayList<String> lis1 = new ArrayList<String>();
			ArrayList<String> lis2 = new ArrayList<String>();

			while (!line.equals("#")) {
				StringTokenizer str = new StringTokenizer(line);
				while (str.hasMoreTokens())
					lis1.add(str.nextToken());
				line = input.readLine();
			}

			line = input.readLine();
			while (!line.equals("#")) {
				StringTokenizer str = new StringTokenizer(line);
				while (str.hasMoreTokens())
					lis2.add(str.nextToken());
				line = input.readLine();
			}

			int n = lis1.size();
			int m = lis2.size();
			int[][] dp = new int[n][m];
			int[][] best = new int[n][m];

			for (int i = 0; i < dp.length; i++) {
				Arrays.fill(dp[i], -1);
			}

			subsequenceLength(dp, best, 0, 0, lis1, lis2);

			ArrayList<String> lis = getAnswer(best, lis1, lis2);


			StringBuilder output = new StringBuilder("");
			for (int i = 0; i < lis.size(); i++) {
				output.append(" " + lis.get(i));
			}

			System.out.println(output.substring(1));

		}
	}

	private static int subsequenceLength(int[][] dp, int[][] best, int i, int j, ArrayList<String> lis1, ArrayList<String> lis2) {

		if (i == lis1.size() || j == lis2.size()) {
			return 0;
		}

		else if (dp[i][j] != -1) {
			return dp[i][j];
		}
		else {
			int max = 0;
			if (lis1.get(i).equals(lis2.get(j))) {
				best[i][j] = 1;
				max = 1 + subsequenceLength(dp, best, i + 1, j + 1, lis1, lis2);
			} 
			else {
				int x = subsequenceLength(dp, best, i + 1, j, lis1, lis2);
				int y = subsequenceLength(dp, best, i, j + 1, lis1, lis2);
				if (x > y) {
					max = x;
					best[i][j] = 2;
				} 
				else {
					max = y;
					best[i][j] = 3;
				}

			}
			return dp[i][j] = max;
		}
	}

	private static ArrayList<String> getAnswer(int[][] best, ArrayList<String> lis1, ArrayList<String> lis2) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		int i = 0;
		int j = 0;
		
		while (i < lis1.size() && j < lis2.size()) {
			if (best[i][j] == 1) {
				list.add(lis1.get(i));
				i++;
				j++;
			} 
			else if (best[i][j] == 2) {
				i++;
			}
			else {
				j++;
			}
		}
		return list;
	}

}
