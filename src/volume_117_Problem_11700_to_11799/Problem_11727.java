/**
 * 
 */
package volume_117_Problem_11700_to_11799;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 1:57:19 AM Sep 7, 2014
 * 
 * Cost Cutting
 */
public class Problem_11727 {

	/**
	 * @param args
	 */
	static int testCases;  
	static int max;  
	static int min;  
	static int a;  
	static int b;  
	static int c;  
	public static void main(String[] args) {  
		Scanner k = new Scanner(System.in);  
		testCases = k.nextInt();  
		for(int i = 1; i < testCases+1; i++) {  
			a = k.nextInt();  
			b = k.nextInt();  
			c = k.nextInt();  
			System.out.print("Case " + i + ": ");  
			if (a > b) {  
				if (b > c) {  
					System.out.println(b);  
					continue;  
				}  
				if (a > c) {  
					System.out.println(c);  
					continue;  
				}  
				System.out.println(a);  
				continue;  
			}  
			if (a > c) {  
				System.out.println(a);  
				continue;  
			}  
			if (b > c) {  
				System.out.println(c);  
				continue;  
			}  
			System.out.println(b);  
			continue;  
		}  
	}  
}


