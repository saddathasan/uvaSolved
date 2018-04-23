/**
 * 
 */
package volume_100_Problem_10000_to_10099;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 *
 *
 *
 *Super Long Sum
 */
public class Problem_10013 {

	public static void main(String[] args) throws IOException  {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int cases=Integer.parseInt(br.readLine());

		String m="";

		StringBuilder lol;	
		StringBuffer sb=new StringBuffer("");

		short[] num1,num2;

		for(int i=0;i<cases;i++){

			lol=new StringBuilder("");

			if(i>0) {
				sb.append("\n");
			}

			br.readLine();

			int block=Integer.parseInt(br.readLine());

			num1=new short[block+1];
			num2=new short[block+1];

			for(int j=0;j<block;j++) {
				String str=br.readLine();
				num1[j]=(short) (str.charAt(0)-48);
				num2[j]=(short) (str.charAt(2)-48);
			}

			short carry=0;
			short rem=0;
			short temp=0;

			for(int j=block-1;j>-1;j--) {
				temp=(short) (num1[j]+num2[j]+carry);
				carry=(short) (temp/10);
				rem=(short) (temp%10);
				lol.append((char) (rem+48));
			}
			if(carry>0) {
				lol.append((char) (carry+48));
			}

			lol=lol.reverse();
			
			sb.append(lol).append("\n");
		}
		System.out.print(sb);
	} 

}
