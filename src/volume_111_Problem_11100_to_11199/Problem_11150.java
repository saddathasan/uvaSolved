/**
 * 
 */
package volume_111_Problem_11100_to_11199;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 */
public class Problem_11150 {

	/**
	 * @param args
	 * 
	 * Cola
	 * 
	 */
	
	public static Scanner k = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int number;
			while (k.hasNext()) {
				
				number = k.nextInt();
				
				if (number % 2 == 1) {
					 System.out.printf("%d\n", total(number, 0));
				}
				else {
					System.out.printf("%d\n", total(number, 2));
				}
			}
		}

	

	public static int total (int N, int E) {

		if (N == 0) {
			return 0;
		}
		
		return N + total((N + E) / 3, (N + E) % 3);
	}


}
