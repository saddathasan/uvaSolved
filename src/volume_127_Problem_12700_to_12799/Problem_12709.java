/**
 * 
 */
package volume_127_Problem_12700_to_12799;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * 
 * Falling Ants
 *
 */
public class Problem_12709 {

	public static Scanner k = new Scanner(System.in);

	public static void main(String []args) {


		
		while(k.hasNext()) 
		{
			int testCase = k.nextInt();
			
			if(testCase==0) break;

			int max=-9999;

			int sum1 = 0, sum = 0;
			for(int i=1;i<=testCase;i++)
			{

				int l = k.nextInt();
				int w = k.nextInt();
				int h = k.nextInt();

				if(h>=max)
				{
					sum = l * w * h;
					if(max == h)
					{
						if(sum>sum1)
						{
							sum1 = sum;
						}
					}
					if(h>max)
					{
						max = h;
						sum1 = sum;
					}
				}
			}
			System.out.println(sum1);
		}
	}

//	public static int max(int a, int b) {
//		if (a>b) {
//			return a;
//		}
//		else {
//			return b;
//		}
//	}



}
