/**
 * 
 */
package volume_004_Problem_400_to_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 * 10:13:35 PM Sep 22, 2014
 */
public class Problem_495 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		StringBuilder sb = new StringBuilder("");
		String m="";

		BigInteger []arr=new BigInteger[5001];

		arr[0]=BigInteger.ZERO;
		arr[1]=BigInteger.ONE;

		for(int i=2;i<5001;i++) {
			arr[i]=arr[i-1].add(arr[i-2]);
		}

		while((m=br.readLine())!=null) {
			int fibonacci_number = Integer.parseInt(m);
			sb.append("The Fibonacci number for ").append(fibonacci_number ).append(" is ").append(arr[fibonacci_number ]).append("\n");
		}
		System.out.print(sb);

	}

}
