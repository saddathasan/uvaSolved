/**
 * 
 */
package volume_104_Problem_10400_to_10499;

import java.util.Scanner;

/**
 * @author Dr. Zola
 * 5:58:41 PM Feb 8, 2015
 */
public class Problem_10432 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);


		while (k.hasNext()) {


			double radius = k.nextDouble();
			double sides = k.nextDouble();


			double side = 2 * radius * Math.sin(Math.PI/sides);
			double apothem = radius * Math.cos(Math.PI/sides);


			double area = sides * side * apothem / 2;


			System.out.printf("%.3f\n", area);




		}

	}

}
