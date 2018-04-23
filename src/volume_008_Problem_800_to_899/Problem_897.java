/**
 * 
 */
package volume_008_Problem_800_to_899;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Saddat Hasan
 * 2:06:58 AM Sep 17, 2014
 * 
 * Anagrammatic Primes
 */
public class Problem_897 {

	public static boolean[] sieve;
	public static ArrayList<Integer> arrayList;
	public static ArrayList<Integer> anagrams;
	
	public static int[] ans = { 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, 97, 113,
		131, 199, 311, 337, 373, 733, 919, 991 };

	private static void sieve(int n) {
		
		sieve = new boolean[n + 1];
		
		Arrays.fill(sieve, true);
		
		sieve[0] = false;
		sieve[1] = false;

		arrayList = new ArrayList<Integer>();
		arrayList.add(2);
		
		int i = 0;
		
		for (i = 2; i <= Math.sqrt(n); i++)
			if (sieve[i]) {
				for (int j = i * i; j <= n; j += i)
					sieve[j] = false;
				arrayList.add(i);
			}

		while (i <= n) {
			if (sieve[i])
				arrayList.add(i);
			i++;
		}
	}

	public static void main(String[] args) throws NumberFormatException,IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sieve(1000);
		// generateAnaPrimes();
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			
			if (n == 0)
				break;

			if (n > 1000) {
				System.out.println(0);
				continue;
			}

			int length = (n + "").length();
			int upper = (int) (Math.pow(10, length));
			int answer = -1;
			
			for (int i = 0; i < ans.length; i++) {
				if (ans[i] > n && ans[i] < upper) {
					answer = ans[i];
					break;
				}
			}
			if (answer != -1)
				System.out.println(answer);
			else
				System.out.println(0);
		}
	}

	// Precalculated
	private static void generateAnaPrimes() {
		
		anagrams = new ArrayList<Integer>();
		
		for (int i = 0; i < arrayList.size(); i++) {
			int curr = arrayList.get(i);
			if (isAnagram(curr))
				anagrams.add(curr);
		}
	}

	private static boolean isAnagram(int n) {
		char[] array = (n + "").toCharArray();
		return perm(array, new char[array.length], 0, new boolean[array.length]);
	}

	private static boolean perm(char[] array, char[] cs, int index,
			boolean[] bools) {
		if (index == array.length) {
			return sieve[Integer.parseInt(new String(cs))];
		} else {
			boolean test = true;
			for (int i = 0; i < array.length; i++)
				if (!bools[i]) {
					bools[i] = true;

					cs[index] = array[i];
					test &= perm(array, cs, index + 1, bools);

					bools[i] = false;
				}
			return test;
		}
	}

}
