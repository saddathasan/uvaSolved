/**
 * 
 */
package volume_100_Problem_10000_to_10099;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 *
 *Pizza Cutting 
 */
public class Problem_10079 {
	
	public static void main (String saddat[]){
        Scanner k = new Scanner(System.in);
        long sum = 1;
        long num = 1;
        long test;
        test=k.nextLong();
 
        while(test>=0){
 
            while(test>0){ // when input zero then output one  bcause  then you will get the whole pizza !!!
 
                sum=sum+num;
                num++;
                test--;
            }
            System.out.println(sum);
            test=k.nextLong();
            sum=1;
            num=1;
        }
    }

}
