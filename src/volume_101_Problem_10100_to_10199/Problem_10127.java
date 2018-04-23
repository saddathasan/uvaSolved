/**
 * 
 */
package volume_101_Problem_10100_to_10199;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 7:46:11 PM Aug 24, 2014
 * 
 * 
 * Ones
 */
public class Problem_10127 {
	
	public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
         
        while(k.hasNext()){
            int ones =1, acc=1, n=k.nextInt();
            while(acc!=0){
                if(n>acc) ones++;
                acc= n>acc ? acc*10 +1  : acc%n;
            }
            System.out.println(ones);
        }
    }

}
