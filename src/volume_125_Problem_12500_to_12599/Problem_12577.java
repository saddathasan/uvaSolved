/**
 * 
 */
package volume_125_Problem_12500_to_12599;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 1:25:11 AM Sep 7, 2014
 * 
 * Hajj - e - Akbar
 */
public class Problem_12577 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
		
		int counter = 0;
		
		while(k.hasNext()) {
			
			String s = k.nextLine();
			
			if (s.charAt(0) != '*' ) {
				counter++;
			
				if (s.charAt(0) == 'H') {
					System.out.println("Case "+counter+": "+"Hajj-e-Akbar");
				}
				else {
					System.out.println("Case "+counter+": "+"Hajj-e-Asghar");
				}
			
			}
			else {
				break;
			}		
			
		}

	}

}
