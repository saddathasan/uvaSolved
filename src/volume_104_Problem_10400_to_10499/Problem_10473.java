/**
 * 
 */
package volume_104_Problem_10400_to_10499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 
 * 
 * Simple Base Conversion
 *
 */
public class Problem_10473 {
	
	public static InputStreamReader input = new InputStreamReader(System.in);
    public static BufferedReader br = new BufferedReader(input);
	
	public static void main(String[] args) throws IOException{
        
        StringBuilder sb = new StringBuilder("");
        String m="";
        
        
        while(true) {
            m=br.readLine();
           
            if(m.charAt(0) =='0' && m.charAt(1) =='x') {
                m=m.substring(2);
                sb.append(Integer.parseInt(m, 16)).append("\n");
            }
            else {
                if(Integer.parseInt(m)<0) {
                    break;
                }
                sb.append("0x").append(Integer.toHexString(Integer.parseInt(m)).toUpperCase()).append("\n");
            }
        }
        System.out.print(sb);
    }

}
