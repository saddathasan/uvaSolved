/**
 * 
 */
package volume_125_Problem_12500_to_12599;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * 
 * Memory OverFlow
 *
 */
public class Problem_12583 {

	/**
	 * @param args
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static Scanner k = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int nCase = k.nextInt();
		
		
		
		for(int tCase=1;tCase<=nCase;tCase++) {
		
			int count=0,n,k,track=0;
			
			char c[505],ch;
			
			scanf(“%d%d%c”,&n,&k,&ch);
			scanf(“%s”,c);
			
			for(int i=1;i<n;i++)
			{
				track=0;
				for(int j=i-k;j<i;j++ )
				{
					if(j<0)
						j=0;
					if(c[i]==c[j])
					{
						track++;
						break;
					}
				}
				if(track>0)
				{
					count++;
				}
			}
			printf(“Case %d: %d\n”,tCase,count);
		}
		return 0;
	}


}


