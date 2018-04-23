/**
 * 
 */
package volume_006_Problem_600_to_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 
 * 
 * Coin Change 
 *
 */
public class Problem_674 {


	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		StringBuffer sb = new StringBuffer("");
		String totalAmount = ""; // The amount of money that has to be change.

		int coins[] = {50,25,10,5,1};

		long array[] = calculationsDP(coins, coins.length, 7489);

		while ((totalAmount = br.readLine()) != null) {

			int number=Integer.parseInt(totalAmount);
			sb.append(array[number]).append("\n");
		}

		System.out.print(sb); //output line 
		
	}

	public static long[] calculationsDP(int coins[], int length, int limit) {
		
		long[] temp = new long[limit + 1];
		
		temp[0] = 1;
		
		for (int i = 0; i < length; i++) {
			
			for (int j = coins[i]; j < limit+1; j++) {
				
				temp[j] += temp[j - coins[i]];
				
			}
		}
		
		return temp;
	}
}

