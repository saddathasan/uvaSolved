/**
 * 
 */
package volume_101_Problem_10100_to_10199;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * Prime Distance
 *
 */
public class Problem_10140 {
	
	
	runtime error ... 


	public static void main(String[] args) {
		boolean[] prime = new boolean[1001];
		Arrays.fill(prime, true);
		
		prime[0] = false;
		
		for (int i = 2; i * i < prime.length; i++) {
			if (prime[i]) {
				for (int j = i * i; j < prime.length; j += i) {
					prime[j] = false;
				}
			}
		}
		
		Scanner k = new Scanner(System.in);
		
		while (k.hasNext()) {
			
			int number = k.nextInt();
			int c = k.nextInt();
			
			ArrayList<Integer> temp = new ArrayList<Integer>();
			
			for (int i = 0; i <= number; i++) {
				if (prime[i]) {
					temp.add(i);
				}
			}
			
			int mid = temp.size() / 2;
			
			String s = number + " " + c + ":";
			
			if (temp.size() % 2 == 0) {
				for (int i = Math.max(0, mid - c); i < mid; i++) {
					s += " " + temp.get(i);
				}
			}
			else {
				for (int i = Math.max(0, mid - c + 1); i < mid; i++) {
					s += " " + temp.get(i);
				}
			}
			
			s += " " + temp.get(mid);
			
			for (int i = mid + 1; i <= Math.min(temp.size()-1, mid + c - 1); i++) {
				s += " " + temp.get(i);
			}
			
			System.out.println(s);
			System.out.println();
		}
	}

}
