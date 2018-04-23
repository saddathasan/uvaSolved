/**
 * 
 */
package volume_004_Problem_400_to_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Saddat Hasan
 *
 *
 *
 *Poly the Polynomial
 */
public class Problem_498 {

	/**
	 * @param args
	 */


	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("");
		String m="";

		while ((m=br.readLine())!=null) {

			StringTokenizer st=new StringTokenizer(m);

			int []array = new int[st.countTokens()];

			for(int i=array.length-1; i>-1; i--){
				array[i]=Integer.parseInt(st.nextToken());
			}

			st=new StringTokenizer(br.readLine());

			int val;

			int counterTok=st.countTokens();

			for(int i=0;i<counterTok;i++) {
				
				if(i>0) {
					sb.append(" ");
				}

				val=Integer.parseInt(st.nextToken());

				long sum=array[0];
				long temp=1;

				for(int j=1;j<array.length;j++) {
					temp*=val;
					sum+=array[j]*temp;
				}
				
				sb.append(sum);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

}


