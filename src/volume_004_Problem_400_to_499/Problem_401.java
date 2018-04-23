/**
 * 
 */
package volume_004_Problem_400_to_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 
 * Palindromes
 *
 */
public class Problem_401 {
	
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	public static StringBuilder output = new StringBuilder();
	
	
	public static void main(String[] args) throws IOException {
		
		String line;
		
		char[] c = new char [300];
		
		for (int i = 1; i < c.length; i++) {
			c[i] = (char) i;
		}
		
		c['E'] = '3';
		c['J'] = 'L';
		c['L'] = 'j';
		c['S'] = '2';
		c['Z'] = '5';
		c['2'] = 'S';
		c['3'] = 'E';
		c['5'] = 'Z';
		
		!while((line = input.readLine()) != null) {
			
			boolean palindrom = inPalindrom(line);
			boolean mirror = isMirror(line, c);
			
			if (!palindrom && mirror) {
				System.out.println(line + " -- is a mirrored string.");
				System.out.println();
				continue;
			}
			
			if (!palindrom) {
				System.out.println(line + " -- is not a palindrome.");
				System.out.println();
				continue;
			}
			
			if (palindrom && mirror) {
				System.out.println(line +" -- is a mirrored palindrome.");
				System.out.println();
				continue;
			}
			
			if (palindrom) {
				System.out.println(line + " -- is a regular palindrome.");
				System.out.println();
			}
		}

		
	}


	private static boolean isMirror(String line, char[] c) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < line.length(); i++) {
			
			sb.append(c[line.charAt(i)]);
			
		}
		
		String res  = sb.toString();
		for (int i = 0, j = res.length() - 1; i<line.length(); i++, j-- ) {
			if (line.charAt(i) != res.charAt(j)) {
				return false;
			}
			
		}
		return true;
	}


	private static boolean inPalindrom(String line) {
		// TODO Auto-generated method stub
		
		for (int i = 0, j = line.length() - 1; i<j; i++, j--) {
			
			if (line.charAt(i) != line.charAt(j)) {
				return false;
			}
		} 
		
		
		return true;
	}
	
	
	
	

}
