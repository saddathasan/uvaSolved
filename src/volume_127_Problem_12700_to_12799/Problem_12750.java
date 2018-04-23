/**
 * 
 */
package volume_127_Problem_12700_to_12799;

import java.util.*;
import java.io.*;



/**
 * @author Saddat Hasan
 * 
 * 
 * Keep Rafa at Chelsea
 *
 */
public class Problem_12750 {


	public static Scanner k = new Scanner(System.in);
	public static PrintWriter pr=new PrintWriter(System.out);


	public static void main (String args[])  {

			int testCase = k.nextInt();

			for(int i=1;i<=testCase;i++) {

				int numberOfGames = k.nextInt();

				//got no of matches
				int canStay=0;
				int deathLimit=3;
				int curDeathLimit=0;

				for(int j=1;j<=numberOfGames;j++) {

					String string = k.next();

					if(curDeathLimit<deathLimit) {

						if(string .compareTo("W")==0) {
							curDeathLimit=0;
						}
						else if(string .compareTo("D")==0 || string .compareTo("L")==0) {
							curDeathLimit++;
						}
						canStay++;
					}
				}

				System.out.print("Case "+i+": ");

				if(curDeathLimit<deathLimit) {
					System.out.println("Yay! Mighty Rafa persists!");
				}

				else{
					System.out.println(canStay);
				}
			}

		
	}
}


