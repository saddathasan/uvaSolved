/**
 * 
 */
package volume_005_Problem_500_to_599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Dr. Zola
 * 12:58:40 AM Apr 20, 2015
 */
public class Problem_541 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer("");
		String s="";
		
		
		while(true){
			int n=Integer.parseInt(br.readLine());
			if(n==0) {
				break;
			}
			int[] cols=new int[n];
			int[] rows=new int[n];
			for(int i=0;i<n;i++){
				String[] str=br.readLine().split(" ");
				for(int j=0;j<n;j++){
					if("1".equals(str[j])){
						cols[j]++;
						rows[i]++;
					}
				} 
			}
			int countRIm=0,tempR=0;
			int countCIm=0,tempC=0;
			for(int i=0;i<n;i++){
				if(cols[i]%2==1) {
					countCIm++;
					tempC=i+1;
				} 
				if(rows[i]%2==1) {
					countRIm++; 
					tempR=i+1;
				} 
			}

			if(countCIm>1 ||countRIm>1){
				sb.append("Corrupt\n");
			}else if(countCIm==1 &&countRIm==0){
				sb.append("Corrupt\n");
			}else if(countCIm==0 &&countRIm==1){
				sb.append("Corrupt\n");
			}
			else if(countCIm==1 &&countRIm==1){
				sb.append("Change bit (").append(tempR).append(",").append(tempC).append(")\n");
			}else{
				sb.append("OK\n");
			}
		}
		System.out.print(sb);
	}

}
