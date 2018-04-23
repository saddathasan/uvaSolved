/**
 * 
 */
package volume_103_Problem_10300_to_10399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 *
 *
 *
 *Mischievous Children 
 */
public class Problem_10338 {
	
	public static InputStreamReader input = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(input);
	

	public static void main(String[] args) throws IOException {
		
		StringBuffer sb = new StringBuffer("");
		String m="";
		
		BigInteger[] arr = new BigInteger[21];
		for (int i = 0; i < 21; i++) {
			arr[i] = BigInteger.ZERO;
		}
		
		arr[0]=BigInteger.ONE;
		arr[1]=BigInteger.ONE;
		
		fact(20,arr);

		int cases=Integer.parseInt(br.readLine());
		int let[]=new int[26];
		
		for(int i=1;i<cases+1;i++) {
			
			m=br.readLine();
			
			int x=m.length();
			
			let=new int[26];
			
			StringBuilder temp=new StringBuilder(m);
			
			for(int j=0;j<temp.length();j++) {
				let[m.charAt(j)-'A']++;
			}
			
			BigInteger sum=BigInteger.ONE;
			
			for(int j=0;j<26;j++) {
				if(let[j]>1) {
					sum=sum.multiply(arr[let[j]]);
				}
			}
			
			BigInteger ans=arr[x].divide(sum);
			sb.append("Data set ").append(i).append(": ").append(ans).append("\n");
		
		}
		
		System.out.print(sb);
	}

	public static BigInteger fact(int x, BigInteger[] arr) {
		if (x == 1 || x == 0) {
			return BigInteger.ONE;
		}
		if (arr[x] != BigInteger.ZERO) {
			return arr[x];
		}
		arr[x] = BigInteger.valueOf(x).multiply(fact(x - 1, arr));
		return arr[x];
	}

}
