/**
 * 
 */
package volume_005_Problem_500_to_599;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 *
 *Box of Bricks
 */
public class Problem_591 {

	/**
	 * @param args
	 */

	public static Scanner k = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int testCase = 0;

		while(true) {
			
			int n=k.nextInt();
			
			if(n==0) {
				break;
			}
			
			int []arr=new int[n];
			int sum=0;
			
			for(int i=0;i<n;i++) {
				arr[i]=k.nextInt();
				sum+=arr[i];
			}
			
			int avg=sum/n;
			int counter=0;
			
			for(int i=0;i<n;i++) {
				if(arr[i]>avg)
					counter+=arr[i]-avg;
			}

			System.out.println("Set #"+(testCase +1));
			System.out.println("The minimum number of moves is "+counter+".");
			System.out.println();
			testCase ++;
		}


	}

}
