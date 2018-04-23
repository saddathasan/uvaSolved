/**
 * 
 */
package volume_124_Problem_12400_to_12499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Saddat Hasan
 * 1:42:05 AM Sep 7, 2014
 * 
 * Save Setu
 */
public class Problem_12403 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb=new StringBuffer();
			
			int cases = Integer.parseInt(br.readLine());
			int report=0;
			
			for (int i = 0; i < cases; i++) {
				
				String temp=br.readLine();
				
				if(temp.equals("report")) {
					sb.append(report).append("\n");
				}
				else {
					String[]str=temp.split(" ");
					int plus=Integer.parseInt(str[1]);
					report+=plus;
				}
			}
			System.out.print(sb);
		}
	}
