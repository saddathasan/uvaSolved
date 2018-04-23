/**
 * 
 */
package volume_002_Problem_200_to_299;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 *
 *Train Swapping
 */
public class Problem_299 {

	/**
	 * @param args
	 */

	public static Scanner k = new Scanner(System.in);

	public static void main(String[] args) throws IOException {


		int testcase = k.nextInt();

		int l, s;

		int[] array;

		for (int c=0; c<testcase; c++) {

			l = k.nextInt();
			array = new int[l];
			for (int a=0; a<l; a++){
				array[a] = k.nextInt();
			}
			s = bubbleSort(array);
			System.out.println("Optimal train swapping takes "+s+" swaps.");
		}
	}

	static int bubbleSort (int[] array) {
		
		int swaps = 0;
		int s = 0;
		int temp;
		
		for (int i=0; i<array.length-1; i++) {
			 
			swaps = 0;
			
			for (int j=0; j<array.length-1-i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swaps++;
					s++;
				}
			}
			
			if (swaps == 0){
				break;
			}
		}
		return s;

	}

}
