/**
 * 
 */
package volume_102_Problem_10200_to_10299;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

/**
 * @author Saddat Hasan
 *
 */
public class Problem_10282 {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 * BabelFish
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer("");
		String m="";
		
		LinkedHashMap<String,String> dictionary =new LinkedHashMap<String, String>();
		
		
		while ((m=br.readLine())!=null) {
			if(m.trim().equals(""))
				break;

			String[]str=m.split(" ");
			dictionary.put(str[1], str[0]);
		}
		while (( m = br.readLine()) != null) {
			m = m.trim();
			if(dictionary.containsKey(m)){
				sb.append(dictionary.get(m)).append("\n");
			}
			else{
				sb.append("eh\n");
			}
		}
		System.out.print(sb);


	}

}
