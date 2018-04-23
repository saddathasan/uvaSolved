/**
 * 
 */
package volume_104_Problem_10400_to_10499;

import java.util.Scanner;

/**
 * @author Dr. Zola
 * 6:30:00 PM Feb 8, 2015
 */
public class Problem_10451 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);


		int counter = 0;

		while (k.hasNext()) {
			double n = k.nextDouble();
			double polygon_area = k.nextDouble();

			double official_area, expectator_area;

			if (n<3) {
				break;
			}
			else {
				counter ++;

				double outer_radius = Math.sqrt(2*polygon_area/(n*Math.sin(2*Math.PI/n)));
				double inner_radius = Math.sqrt(polygon_area/(n*Math.tan(Math.PI/n)));

				double area1 = (Math.PI*Math.pow(outer_radius, 2));

				expectator_area = area1 - polygon_area; 

				official_area = polygon_area - (Math.PI*Math.pow(inner_radius, 2));

			}

			System.out.printf("Case %d: %5f %5f\n", counter,expectator_area,official_area);


		}

	}

}
