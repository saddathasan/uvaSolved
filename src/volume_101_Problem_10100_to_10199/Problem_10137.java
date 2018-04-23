/**
 * 
 */
package volume_101_Problem_10100_to_10199;

import java.util.Scanner;

/**
 * @author Dr. Zola
 * 12:28:26 AM Feb 9, 2015
 */
public class Problem_10137 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);

		//String line;

		while (k.hasNext()) {

			int number_of_students = k.nextInt();


			if (number_of_students == 0) {
				break; 
			}
			else {

				double[] expenses = new double[number_of_students];

				for (int i = 0; i < number_of_students; i++) {
					expenses[i] = Math.round(k.nextDouble() * 100);
				}

				double amount = exchange_money(expenses);

				System.out.printf("$%.2f\n",amount/100);

			}
		}
	}






	public static double exchange_money(double[] expenses) {

		int exchange_amount = 0; 
		int students = expenses.length;

		double average_exp = 0;
		double total_exp = 0; 
		for (double expense : expenses) {
			total_exp += expense;
		}

		average_exp = Math.round(total_exp / students);

		int received = 0, given = 0;

		for (int i = 0; i < students; i++) {
			double difference = expenses[i] - average_exp;
			if(difference > 0) {
				received += difference;
			}
			else {
				given -= difference;
			}
		}

		exchange_amount = received < given ? received : given;

		return exchange_amount;
	}




}
