/**
 * 
 */
package volume_103_Problem_10300_to_10399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 *
 *
 *  Ray Through Glasses
 */
public class Problem_10334 {
	
	 public static void main(String[] args) throws IOException {
	        InputStreamReader input = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(input);
	      
	        StringBuffer sb=new StringBuffer("");
	        String m="";
	      
	        BigInteger []arr=new BigInteger[5001];
	       
	        arr[0]=BigInteger.ONE;
	        arr[1]=BigInteger.valueOf(2);
	       
	        for(int i=2;i<5001;i++) {
	            arr[i]=arr[i-1].add(arr[i-2]);
	        }
	       
	        while((m=br.readLine())!=null) {
	            int x=Integer.parseInt(m);
	            sb.append(arr[x]).append("\n");
	        }
	        
	        System.out.print(sb);
	    }

}
