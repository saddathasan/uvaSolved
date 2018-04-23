/**
 * 
 */
package volume_111_Problem_11100_to_11199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 
 * 
 * Ternary
 *
 */
public class Problem_11185 {

	public static  InputStreamReader input = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(input);

	public static void main(String[] args) throws IOException {

		StringBuilder output = new StringBuilder("");
		String m = "";

		while (true) {
			m = br.readLine();
			if (Integer.parseInt(m) < 0) {
				break;
			}
			output.append(Integer.toString(Integer.parseInt(m),3)).append("\n");
		}
		System.out.print(output);
	}

}
