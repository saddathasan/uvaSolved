/**
 * 
 */
package volume_005_Problem_500_to_599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 
 * 
 * Goldbach's Conjecture
 *
 */
public class Problem_543  {

	public static InputStreamReader input = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(input);


	public static void main(String[] args) throws IOException {

		StringBuffer sb = new StringBuffer("");
		String m = "";

		boolean notPrime[]=sievePrime(1000*1000);

		while (true) {

			int x = Integer.parseInt(br.readLine());

			if(x==0) {
				break;
			}

			int i=1,j=x-1;

			while(true) {

				if(i>j) {
					break;
				}

				while(notPrime[i]) {
					i++;
				}

				while(notPrime[j]) {
					j--;
				}

				if(i+j==x) {
					sb.append(x).append(" = ").append(i).append(" + ").append(j).append("\n");
					break;
				}

				else if(i+j>x) {
					j--;
				}
				else if(i+j<x) {
					i++;
				}
			}
		}
		System.out.print(sb);
	}

	public static boolean [] sievePrime(int x) {
		
		boolean[] notPrime = new boolean[x + 1];
		
		notPrime[0]=true;
		notPrime[1]=true;
		
		for (int i = 2; i*i < x+1; i++) {
			if (!notPrime[i]) {
				for (int j = i; i*j < x+1; j++) {
					notPrime[i*j] = true;
				}
			}
		}
		return notPrime;
	}

}
