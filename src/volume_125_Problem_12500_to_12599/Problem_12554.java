/**
 * 
 */
package volume_125_Problem_12500_to_12599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Saddat Hasan
 *
 *
 *A Special "Happy Birthday" Song!!!
 */
public class Problem_12554 {

	public static String[] song = {"Happy", "birthday", "to", "you",   
		"Happy", "birthday", "to", "you",   
		"Happy", "birthday", "to", "Rujia",  
		"Happy", "birthday", "to", "you"  
	};  

	public static void main(String[] args) throws Exception {  

		Reader.init(System.in);  


		int noOfPeople = Reader.nextInt();  

		String[] peopleNames = new String[noOfPeople];  

		for(int i = 0; i < noOfPeople; i++) {  
			peopleNames[i] = Reader.next();  
		}  

		boolean isDone = false;  
		int i = 0;  



		while(!isDone) {  
			System.out.println(peopleNames[i%noOfPeople] + ": " + song[i%16]);  
			if(i%16 == 15 && i >= noOfPeople) isDone = true;  
			i++;  

		}  
	}  
}  

class Reader {  

	static BufferedReader br;  
	static StringTokenizer tokenizer;  

	/** call this method to initialize reader for InputStream */  
	public static void init(InputStream input) {  
		br = new BufferedReader(new InputStreamReader(input));  
		tokenizer = new StringTokenizer("");  
	}  
	/** get next word */  
	public static String next() throws IOException {  
		while ( ! tokenizer.hasMoreTokens() ) {  
			//TODO add check for eof if necessary  
			tokenizer = new StringTokenizer(br.readLine());  
		}  
		return tokenizer.nextToken();  
	}  
	public static int nextInt() throws IOException {  
		return Integer.parseInt( next() );  
	}  
	public static double nextDouble() throws IOException {  
		return Double.parseDouble( next() );  
	}  

}
