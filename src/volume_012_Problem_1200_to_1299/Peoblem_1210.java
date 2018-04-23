/**
 * 
 */
package volume_012_Problem_1200_to_1299;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Saddat Hasan
 *
 */
public class Peoblem_1210 {






	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		StringBuffer sb=new StringBuffer("");
		String m="";
		boolean notPrime[]=sievePrime(10000);
		notPrime[0]=true;
		notPrime[1]=true;
		int[] sum=new int[10001];
		int temp=0;
		for(int i=2;i<10001;i++){
			if(!notPrime[i]){
				sum[i]++;
				temp=i;
				for(int j=i+1;j<10001;j++) {
					if(!notPrime[j]){
						temp+=j;
						if(temp<10001)
							sum[temp]++;
					}
				}
			}
		}
		while(true){
			int x=Integer.parseInt(br.readLine().trim());
			if(x==0)
				break;
			sb.append(sum[x]).append("\n");
		}
		System.out.print(sb);
	}

	static boolean [] sievePrime(int x){
		boolean[] notPrime = new boolean[x + 1];
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


