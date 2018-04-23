/**
 * 
 */
package volume_004_Problem_400_to_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Saddat Hasan
 * 1:55:31 AM Sep 17, 2014
 */
public class Problem_406 {

	public static void main(String[] Dr_Zola) throws IOException {

		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);

		StringBuffer sb = new StringBuffer("");
		String m = "";

		boolean prime[]=sieve(1000);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for(int i=1;i<1001;i++) {
			if(!prime[i]){
				arrayList.add(i);
			}
		}
		while ((m=br.readLine()) != null) {

			String[] str=m.split(" ");

			int n = Integer.parseInt(str[0]);
			int c = Integer.parseInt(str[1]);

			int index=-1 ,temp=n;

			while (index==-1) {
				index = arrayList.indexOf(temp);
				temp--;
			}

			List<Integer> numberList = arrayList.subList(0, index+1);

			if (2*c<numberList.size()) {
				if (numberList.size()%2==0) {
					numberList = arrayList.subList((numberList.size()-2*c)/2, (numberList.size()+2*c)/2);
				}
				else {
					numberList=arrayList.subList((numberList.size()-2*c+2)/2, (numberList.size()+2*c)/2);
				}
			}
			sb.append(n).append(" ").append(c).append(":");
			for(int i=0;i<numberList.size();i++){
				sb.append(" ").append(numberList.get(i));
			}
			sb.append("\n\n");
		}
		System.out.print(sb);
	}

	static boolean [] sieve(int x) {

		boolean[] notPrime = new boolean[x + 1];

		notPrime[0]=true;
		notPrime[1]=false;


		for (int i = 2; i*i < x+1; i++) {
			if (!notPrime[i]) {
				for (int j = i; i*j < x+1; j++) {
					notPrime[i*j] = true;
				}
			}
		}
		return notPrime;
	}

}
