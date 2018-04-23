/**
 * 
 */
package volume_115_Problem_11500_to_11599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 *
 */
public class Problem_11526 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * H(n)
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer("");

		int testCase=Integer.parseInt(br.readLine());

		for(int i=0;i<testCase;i++) {

			int x=Integer.parseInt(br.readLine());

			sb.append(H(x)).append("\n");
		}

		System.out.print(sb);
	}

	public static long H(int number) {

		if (number<1) {
			return 0;
		}

		long sum = 0;

		int sqr = (int) (Math.sqrt(number));

		for (int i = 1, current_value = number; i < sqr + 1; i++) {

			int temp = number / i;

			sum += temp + (current_value - temp) * (i - 1);

			current_value = temp;
		}

		if (number / sqr > sqr) {
			sum += sqr;
		}

		return sum;

	}

	/*
	 * 
	 * long H(int x){
    if(x<1)
        return 0;
    long sum = 0;
    int sqr = floor(sqrt(x)),i = 1, end = x,temp;
    for (; i < sqr + 1; i++) {
        temp = x / i;
        sum += temp + (end - temp) * (i - 1);
        end = temp;
    }
    if (x / sqr > sqr) {
        sum += sqr;
    }
    return sum;
    }
	 * 
	 */



}
