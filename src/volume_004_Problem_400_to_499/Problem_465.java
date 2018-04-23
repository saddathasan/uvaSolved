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
 *
 */
public class Problem_465 {
	
	public static InputStreamReader input = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(input);
	public static BigInteger maximum = new BigInteger(Integer.MAX_VALUE+"");

	public static void main(String[] args) throws IOException {

		StringBuffer sb=new StringBuffer("");
		String m="";


		while((m=br.readLine())!=null) {

			sb.append(m).append("\n");
			StringBuilder[] str=new StringBuilder[3];

			for(int i=0;i<3;i++) {
				str[i]=new StringBuilder("");
			}

			for(int i=0,counter=0;i<m.length();i++) {
				if(m.charAt(i)>='0' && m.charAt(i)<='9') {
					str[counter].append(m.charAt(i));
				}
				if(m.charAt(i)=='+' || m.charAt(i)=='*') {
					counter++;
					str[counter].append(m.charAt(i));
					counter++;
				}
			}

			BigInteger x=new BigInteger(str[0].toString());
			if(x.compareTo(maximum)==1) {
				sb.append("first number too big\n");
			}

			BigInteger y=new BigInteger(str[2].toString());

			if(y.compareTo(maximum)==1) {
				sb.append("second number too big\n");
			}
			if("+".equals(str[1].toString())) {
				if(x.add(y).compareTo(maximum)==1) {
					sb.append("result too big\n");
				}
			}
			else {
				if(x.multiply(y).compareTo(maximum)==1)
					sb.append("result too big\n");
			}

		}
		System.out.print(sb); // output Line 
	
	}
}


