/**
 * 
 */
package volume_104_Problem_10400_to_10499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 * 
 * 
 * Largest common subsequence ...
 *
 */
public class Problem_10405 {



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer("");
		
		String str1 = "", str2="";
		
		while((str1=br.readLine())!=null){
			str2=br.readLine();
			int x=compute(str1,str2);
			sb.append(x).append("\n");
		}
		System.out.print(sb);
	}


	public static int compute(String str1, String str2) {

		int[][] lengths = new int[str1.length()+1][str2.length()+1];


		for (int i = 0; i < str1.length(); i++) {


			for (int j = 0; j < str2.length(); j++) {

				if (str1.charAt(i) == str2.charAt(j)) {
					lengths[i+1][j+1] = lengths[i][j] + 1;
				}
				else {
					lengths[i+1][j+1] = Math.max(lengths[i+1][j], lengths[i][j+1]);
				}
			}


		}
		return lengths[str1.length()][str2.length()];


	}
}


