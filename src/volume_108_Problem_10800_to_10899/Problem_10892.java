/**
 * 
 */
package volume_108_Problem_10800_to_10899;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * @author Saddat Hasan
 * 
 * LCM Cardinality
 *
 */
public class Problem_10892 {
	
	 
	    public static void main(String[] args) throws Exception {
	        
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder output = new StringBuilder("");
	      
	        LinkedList<Integer> divisors;
	      
	        int n,counter;
	      
	        while((n = Integer.parseInt(br.readLine().trim()))!=0) {
	           
	        	divisors = new LinkedList<Integer>();
	            counter =0;
	           
	            for (int i = 1; i*i <= n; i++) {
	                if(n%i == 0) {
	                    divisors.add(i);
	                    divisors.add(n/i);
	                }
	            }
	            
	            for (int i = 0; i < divisors.size(); i++) {
	                for (int j = i; j < divisors.size(); j++) {
	                    if(i!=j &&isLCM(divisors.get(i), divisors.get(j), n))
	                        counter++;
	                }
	            }
	            if(isSqu(n))
	                counter--;
	            output.append(n + " " + (counter+1)+ "\n");
	        }
	        System.out.print(output);
	    }
	    
	    public static int GCD(int a, int b) {
	        return b==0 ? a:GCD(b,a%b);
	    }
	    public static int LCM(int a, int b) {
	        return a*(b/GCD(a,b));
	    }
	    public static boolean isLCM(int a, int b, int n) {
	        return LCM(a,b) == n;
	    }
	    public static boolean isSqu(int n) {
	        double x = Math.sqrt(n);
	        int y = (int) Math.sqrt(n);
	        return x == y;
	    }

}
