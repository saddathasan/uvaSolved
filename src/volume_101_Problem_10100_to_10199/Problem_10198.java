/**
 * 
 */
package volume_101_Problem_10100_to_10199;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 *
 *
 *
 *Counting 
 */
public class Problem_10198 {

	public static void main(String[] args) throws IOException {
	
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		
		StringBuffer sb=new StringBuffer("");
		String m="";
		
		BigInteger bg[]=new BigInteger[1001];
		
		bg[1]=BigInteger.valueOf(2);
		bg[2]=BigInteger.valueOf(5);
		bg[3]=BigInteger.valueOf(13);
		
		for(int i=4;i<1001;i++){
			bg[i]=bg[i-3].add(bg[i-2]).add(bg[i-1].multiply(BigInteger.valueOf(2)));
		}
		
		int x=0;
		
		while((m=br.readLine())!=null) {
			x=Integer.parseInt(m);
			sb.append(bg[x]).append("\n");
		}
		
		System.out.print(sb);
	}

}
