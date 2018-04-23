/**
 * 
 */
package volume_109_Problem_10900_to_10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 *
 */
public class Problem_10922 {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 * 
	 * 
	 * 
	 * 2 The 9s
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		StringBuffer sb = new StringBuffer("");
		String m = "";

		while(true) {

			m = br.readLine();

			if("0".equals(m)) {
				break;
			}
			
			BigInteger number = new BigInteger(m);

			if(number.remainder(BigInteger.valueOf(9)).compareTo(BigInteger.ZERO)==0) {
				sb.append(m).append(" is a multiple of 9 and has 9-degree ").append(sum(m,true)).append(".\n");
			}
			else {
				sb.append(m).append(" is not a multiple of 9.\n");
			}
		}
		System.out.print(sb);
	}

	public static int sum (String number,boolean flag) {
		
		if("9".equals(number)&&flag) {
			return 1;
		}
		
		if("9".equals(number)&&!flag) {
			return 0;
		}
		
		int count=0;

		for(int i=0;i<number.length();i++) {
			count += number.charAt(i)-'0';
		}

		return 1+sum(count+"",false);
	}

}
