/**
 * 
 */
package volume_109_Problem_10900_to_10999;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 */
public class Problem_10922_Alternative {

	/**
	 * @param args
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 2 The 9s
	 */



	public static Scanner k = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String number = k.next();

		while (number.charAt(0) != '0') {

			String t = number;

			int cycle = 0;

			do {
				
				cycle++;
				int n = 0;
				
				for (int i = 0; i < number.length(); i++) {
					n += number.charAt(i) - '0';
				}
				number = n + "";
			} 

			while (number.length() != 1);

			if (number.equals("9")) {
				System.out.printf(
						"%s is a multiple of 9 and has 9-degree %d.\n", t,
						cycle);
			}
			else {
				System.out.printf("%s is not a multiple of 9.\n", t);
			}
			number = k.next();
		}


	}

}
