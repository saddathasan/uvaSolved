/**
 * 
 */
package volume_119_Problem_11900_to_11999;

import java.util.Scanner;



/**
 * @author Saddat Hasan
 * 12:48:06 AM Aug 27, 2014
 */
public class Problem_11934 {

	
	problem er name likha hoy nai 
	submit kora hoy nai 
	
	
	
	/**
	 * @param args
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);
		
		
		int counter = 0;
		while (k.hasNext()) {
		
			int a = k.nextInt(), 
			b = k.nextInt(), 
			c = k.nextInt(), 
			d = k.nextInt(), 
			l = k.nextInt();
			
			
			if (a==0 && b==0 && c==0 && d==0 && l==0) {
				break;
			}
			else {
				for (int i = 0; i <= l; i++) {
					
					int formula = a*(i*i)+b*i+c;
					
					if (formula % d == 0) {
						counter++;
					}
					
				}
			}
			
		}
		System.out.println(counter);

	}

}
