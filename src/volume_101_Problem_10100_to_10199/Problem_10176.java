/**
 * 
 */
package volume_101_Problem_10100_to_10199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 
 * 
 * Ocean Deep ! - Make it shallow !! 
 *
 */
public class Problem_10176 {

	public static InputStreamReader input = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(input);


	public static void main(String[] args) throws IOException {

		StringBuilder sb = new StringBuilder();
		String m = "";

		while ((m = br.readLine()) != null) {

			while (!m.endsWith("#")) {
				m += br.readLine();
			}
			
			int mod=0;
			
			for (int i = 0; i < m.length()-1; i++) {
				Character temp = m.charAt(i);
				mod = (mod*2 + Integer.parseInt(temp.toString())) % 131071;
			}

			if (mod==0) {
				sb.append("YES").append("\n");
			} 
			else {
				sb.append("NO").append("\n");
			}

		}
		System.out.print(sb);
	}


}
