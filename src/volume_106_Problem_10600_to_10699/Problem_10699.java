/**
 * 
 */
package volume_106_Problem_10600_to_10699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 2:49:40 AM Sep 17, 2014
 * 
 * Count the factors 
 */
public class Problem_10699 {

	public static void main(String[] drZola) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		StringBuffer sb = new StringBuffer("");
		String m = "";

		boolean[] primeArray = sievePrime(1000*1000);

		while ((m=br.readLine())!=null) {

			if("0".equals(m))
				break;
			int x=Integer.parseInt(m);
			sb.append(x).append(" : ").append(countFactors(x, primeArray)).append("\n");
		}
		System.out.print(sb);
	}

	static boolean[] sievePrime(int x) {
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

	static int countFactors(int x,boolean[]  arr) {
		int count=0,i;
		for(i=1;i<Math.sqrt(x);i++) {
			if(x%i==0){
				if(!arr[i]) {
					count++;
				}
				if(x/i!=i && !arr[x/i]) { 
					count++;
				}
			}
		}
		return count;
	}

}
