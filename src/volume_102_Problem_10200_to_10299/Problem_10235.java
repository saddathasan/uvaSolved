/**
 * 
 */
package volume_102_Problem_10200_to_10299;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 *
 *Simply Emirp
 *
 */
public class Problem_10235 {
	
	public static InputStreamReader isr = new InputStreamReader(System.in);
	public static BufferedReader input = new BufferedReader(isr);
	public static StringBuffer output = new StringBuffer("");


	public static void main(String[] args) throws IOException {
		
		String s = "";
		
		boolean notPrime[] = sievePrime(1000 * 1000);
		
		while ((s = input.readLine()) != null) {
			int x = Integer.parseInt(s);
			if (notPrime[x]) {
				output.append(x).append(" is not prime.\n");
			} 
			else {
				int temp=reverse(x);
				if (notPrime[temp] || temp==x) {
					output.append(x).append(" is prime.\n");
				} 
				else {
					output.append(x).append(" is emirp.\n");
				}
			}
		}
		System.out.print(output);
	}




	public static boolean[] sievePrime(int x) {
		boolean[] notPrime = new boolean[x + 1];
		
		notPrime[0] = true;
		notPrime[1] = true;
		
		for (int i = 2; i * i < x + 1; i++) {
			if (!notPrime[i]) {
				for (int j = i; i * j < x + 1; j++) {
					notPrime[i * j] = true;
				}
			}
		}
		return notPrime;
	}

	public static int reverse(int x) {
		StringBuilder sb = new StringBuilder(x + "");
		sb = sb.reverse();
		return Integer.parseInt(sb.toString());
	}

}
