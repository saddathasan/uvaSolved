/**
 * 
 */
package volume_104_Problem_10400_to_10499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Saddat Hasan
 *
 *
 *
 *List of Conquests
 */
public class Problem_10420 {

	/**
	 * @param args
	 */

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws NumberFormatException, IOException {

		Map<String, Integer> map = new HashMap<String, Integer>();
		String s;
		Integer count;
		int cases = Integer.parseInt(br.readLine());
		for (int c=0; c<cases; c++){
			s = br.readLine();
			s = s.split(" ")[0];
			count = map.get(s);
			if (count == null){
				map.put(s, 1);
			}else{
				map.put(s, ++count);
			}
		}
		List<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list);
		int c;

		for (String a: list){
			c = map.get(a);
			System.out.println(a + " " + c);
		}

	}

}
