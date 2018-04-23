/**
 * 
 */
package volume_004_Problem_400_to_499;

/**
 * @author Saddat Hasan
 *
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;





public class Problem_458 {
	/*
	 * The Decoder 
	 */
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(System.in);
		DataOutputStream output = new DataOutputStream(System.out) ;
		int C;
		while ((C =in.read()) !=-1)
			output.write((Character.isSpace((char)C) ? C : (C-7)));
	}




}
