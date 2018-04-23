/**
 * 
 */
package volume_007_Problem_700_to_799;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 *
 *Exponentiation
 */
public class Problem_748 {

	public static void main(String[] args) throws IOException {
		
		Scanner k = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer("");
		String m = "";
	
		
		
		while (k.hasNext()) {
		
			String str = k.next();
			
			int ex = k.nextInt();
			
			BigDecimal bd = new BigDecimal(str);
			BigDecimal result=bd.pow(ex);
			
			result = zeros(result);
			
			String temp = result.toPlainString();
			
			if (temp.charAt(0) == '0') {
				temp = temp.substring(1);
			}
			sb.append(temp).append("\n");
		}
		System.out.print(sb);
	}

	public static BigDecimal zeros(BigDecimal number) {
		
		try {
			while (true) {
				number = number.setScale(number.scale() - 1);
			}
		} 
		catch (ArithmeticException e) {

		}
		return number;
	}


}
