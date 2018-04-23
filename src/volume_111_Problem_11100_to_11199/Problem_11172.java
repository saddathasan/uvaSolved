/**
 * 
 */
package volume_111_Problem_11100_to_11199;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 *
 *Relational Operator
 */
public class Problem_11172 {
	
	 public static void main (String chayapoth[]){
	        Scanner k = new Scanner(System.in);
	        int testcase;
	        testcase = k.nextInt();
	        long a;
	        long b;
	        while(testcase>0) {
	 
	            a = k.nextInt();
	            b = k.nextInt();
	 
	              if(a < b)
	                  System.out.println("<");
	              else if (a > b)
	                  System.out.println(">");
	              else if (a == b)
	                  System.out.println("=");
	  
	 
	            testcase--;
	        }
	    }

}
