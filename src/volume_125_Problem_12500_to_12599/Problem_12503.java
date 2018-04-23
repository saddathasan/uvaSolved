/**
 * 
 */
package volume_125_Problem_12500_to_12599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 *
 *
 *Robot Instructions
 */
public class Problem_12503 {
	
	public static void main(String[] args) throws IOException {
       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
		StringBuilder sb = new StringBuilder();
       
        int testCase = Integer.parseInt(br.readLine());
       
        String [] sp;
        int number_of_instructions;
        int []map;
       
        for (int i = 0; i < testCase; i++) {
           
        	number_of_instructions = Integer.parseInt(br.readLine());
         
            map = new int[number_of_instructions+1];
           
            for (int j = 1; j < map.length; j++) {
                sp = br.readLine().split( " ");
                if(sp.length == 1){
                    map[j] = map[j-1] + ((sp[0].matches("LEFT")) ? -1 : 1);
                }else{
                    map[j] = map[j-1] + map[Integer.parseInt(sp[sp.length - 1])] - map[Integer.parseInt(sp[sp.length - 1]) - 1];
                }
            }
            sb.append(map[number_of_instructions] + "\n");
        }
        System.out.print(sb);
    }

}
