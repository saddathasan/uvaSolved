/**
 * 
 */
package volume_006_Problem_600_to_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 *
 *
 *Numerically Speaking 
 */
public class Problem_619 {

	public static void main(String[] args) throws IOException { 

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		StringBuilder sb = new StringBuilder("");
		String m="";

		int[] array = new int[27];

		for(int i=1;i<27;i++) {
			array[i]=i;
		}


		while(true) {
			
			String answer_in_string = "";
			String anwer_in_numbers = "";

			m=br.readLine();

			if("*".equals(m)) {
				break;
			}
			if(m.charAt(0)>='0' && m.charAt(0)<='9') {
				answer_in_string=bigInteger_to_String(new BigInteger(m));
				anwer_in_numbers =m;
			}
			else {
				answer_in_string=m;
				anwer_in_numbers =string_to_bigInteger(m, array).toString();
			}

			anwer_in_numbers =addComas(anwer_in_numbers );

			sb.append(answer_in_string);

			for(int i=answer_in_string.length();i<22;i++) {
				sb.append(" ");
			}
			sb.append(anwer_in_numbers ).append("\n");
		}
		System.out.print(sb);
	}

	public static BigInteger string_to_bigInteger(String x, int []arr) {

		BigInteger temp= BigInteger.ZERO;

		for(int i=0;i<x.length();i++) {
			int index = x.charAt(i)-96;

			if(index>0 && index<27) {
				temp=temp.add(BigInteger.valueOf(index).multiply(BigInteger.valueOf(26).pow(x.length()-i-1)));
			}
		}
		return temp;
	}

	public static String bigInteger_to_String(BigInteger x) {

		StringBuilder sb= new StringBuilder("");
		BigInteger bg=x;

		while (bg.compareTo(BigInteger.ZERO)>0) {

			BigInteger lol=bg.mod(BigInteger.valueOf(26));

			int sim = lol.intValue();

			bg=bg.divide(BigInteger.valueOf(26));

			char c=(char) (lol.intValue()+96);

			sb.append(c);
		}
		return sb.reverse().toString();
	}

	static String addComas(String x) {

		StringBuilder sb=new StringBuilder("");

		for(int i=x.length()-1,index=1;i>0;i--,index++) {
			sb.append(x.charAt(i));
			if(index%3==0)
				sb.append(",");
		}
		sb.append(x.charAt(0));
		return sb.reverse().toString();
	}

}
