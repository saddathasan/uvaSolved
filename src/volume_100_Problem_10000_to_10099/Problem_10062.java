/**
 * 
 */
package volume_100_Problem_10000_to_10099;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



/**
 * @author Saddat Hasan
 * 5:21:55 AM Aug 27, 2014
 * 
 * * Tell me the frequencies!
 * 
 */

public class Problem_10062 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		StringBuffer sb = new StringBuffer("");
		String m = "";

		StringBuilder temp = new StringBuilder("");

		boolean flag=false;

		while ((m = br.readLine()) != null) {

			if(flag) {
				sb.append("\n");
			}

			Freq[] arr=new Freq[97];

			for(int i=0;i<97;i++) {
				arr[i]=new Freq(0, (char)(i+31));
			}

			for(int i=0;i<m.length();i++) {
				arr[m.charAt(i)-31].inc();
			}

			Arrays.sort(arr);

			for(int i=0;i<arr.length;i++) {
				if(arr[i].getX()>0){
					sb.append(arr[i].getC()).append(" ").append(arr[i].getX()).append("\n");
				}
			}
			flag=true;
		}
		System.out.print(sb);


	}
}
class Freq implements Comparable<Freq> {
	int x=0;
	char c=0;

	public Freq(int num,char temp) {
		x=num;
		c=temp;
	}

	public void inc(){
		x++;
	}

	public int getC() {
		return c;
	}

	public int getX() {
		return x;
	}

	@Override
	public int compareTo(Freq o) {
		if(x>o.getX())
			return 1;
		else if(x==o.getX()){
			if(c>o.getC())
				return -1;
			else
				return 1;
		}
		return -1;


	}

}
