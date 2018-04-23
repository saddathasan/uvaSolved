/**
 * 
 */
package volume_122_Problem_12200_to_12299;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 *
 *
 *One - Two - Three
 */
public class Problem_12289 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer("");

		int testCase=Integer.parseInt(br.readLine());

		for(int i=0;i<testCase;i++) {
			sb.append(number_generator(br.readLine())).append("\n");
		}

		System.out.print(sb);
	}

	static int number_generator(String x) {

		if(x.length()==3) {
			
			int two=0,one=0;
			
			if(x.charAt(0)=='o') {
				one++;
			}
			
			if(x.charAt(1)=='n') {
				one++;
			}
			
			if(x.charAt(2)=='e') {
				one++;
			}
			
			if(x.charAt(0)=='t') {
				two++;
			}
			
			if(x.charAt(1)=='w') {
				two++;
			}
			
			if(x.charAt(2)=='o') {
				two++;
			}
			
			if(one>two) {
				return 1;
			}
			return 2;
		}
		
		else {
			return 3;
		}
	}

}
