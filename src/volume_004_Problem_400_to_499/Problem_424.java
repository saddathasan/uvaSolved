/**
 * 
 */
package volume_004_Problem_400_to_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 *
 *
 *Integer Inquiry 
 */
public class Problem_424 {
	
	public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
       
        BigInteger sum=BigInteger.ZERO;
          
        while(true) {
               String num = br.readLine();
              
               BigInteger number = new BigInteger(num);
               
               if(number.compareTo(BigInteger.ZERO)==0) {
                   break;
               }
               
               sum=sum.add(number);
            }
            System.out.println(sum);
    }

}
