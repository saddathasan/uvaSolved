/**
 * 
 */
package volume_004_Problem_400_to_499;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 *
 *
 *Triangle wave
 */
public class Problem_488 {

	/**
	 * @param args
	 */
	
	
	public static Scanner k = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException
	{
		
		int testCase = k.nextInt();
		

		String[] amplitude = {"","1","22","333","4444","55555",
				"666666","7777777","88888888","999999999"};

		StringBuffer sb;

		for (int test=0; test<testCase; test++)
		{
			int applitude_number = k.nextInt();
			int frequency = k.nextInt();

			if (applitude_number == 0){
				for (int i=1;i<frequency;i++){
					System.out.println();
				}
				continue;
			}

			if (frequency == 0)
			{
				System.out.println();
			}
			else
			{
				sb = new StringBuffer();
				for (int i=1; i<=applitude_number;i++){
					sb.append(amplitude[i]);
					sb.append("\n");
				}
				for (int i=applitude_number-1; i>0;i--){
					sb.append(amplitude[i]);
					sb.append("\n");
				}
				for (int j=0; j<frequency; j++)
				{
					System.out.print(sb.toString());
					if(test < (testCase-1)){
						System.out.println();
					} else if((test == (testCase-1)) && (j <frequency-1)){
						System.out.println();
					}
				}
			}


		}
	}

}


