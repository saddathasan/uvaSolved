/**
 * 
 */
package volume_122_Problem_12200_to_12299;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 2:19:59 AM Sep 7, 2014
 * 
 * Language Detection
 */
public class Problem_12250 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner k = new Scanner(System.in);
		
		int testCase = 0;
		
		while (k.hasNext()) {
			
			String s = k.nextLine();
			
			
			if (s.equals("#")) {
				break;
			}
			else {
				testCase++;
				
				if (s.equals("HELLO")) {
					System.out.println("Case "+testCase+": "+"ENGLISH");
				}
				else if (s.equals("HOLA")) {
					System.out.println("Case "+testCase+": "+"SPANISH");
				}
				else if (s.equals("HALLO")){
					System.out.println("Case "+testCase+": "+"GERMAN");
				}
				else if (s.equals("BONJOUR")) {
					System.out.println("Case "+testCase+": "+"FRENCH");
				}
				else if (s.equals("CIAO")) {
					System.out.println("Case "+testCase+": "+"ITALIAN");
				}
				else if (s.equals("ZDRAVSTVUJTE")) {
					System.out.println("Case "+testCase+": "+"RUSSIAN");
				}
				else {
					System.out.println("Case "+testCase+": "+"UNKNOWN");
				}
			}
			
		}
		

	}

}
