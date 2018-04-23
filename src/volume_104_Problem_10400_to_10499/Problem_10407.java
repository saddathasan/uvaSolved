/**
 * 
 */
package volume_104_Problem_10400_to_10499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 
 * Simple Division
 * 
 *
 */
public class Problem_10407 {

	public static void main(String[] args) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		StringBuffer sb = new StringBuffer("");
		String m = "";

		while ((m = br.readLine()) != null) {
			if("0".equals(m)) {
				break;
			}

			String[] str = m.split(" ");

			int[] array = new int[str.length-1];

			int min = Integer.MAX_VALUE;

			for(int i=0;i<array.length;i++) {
				
				array[i] = Integer.parseInt(str[i]);
				
				if(array[i]<min) {
					min=array[i];
				}
			}
			
			for(int i=0;i<array.length;i++) {
				array[i]-=min;
			}

			int result=0;

			for(int i=0;i<array.length;i++) {
				result=gcd(result,array[i]);
			}

			sb.append(result).append("\n");
		}

		System.out.print(sb);
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
