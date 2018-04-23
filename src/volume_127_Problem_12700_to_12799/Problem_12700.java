/**
 * 
 */
package volume_127_Problem_12700_to_12799;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 * 
 * 
 * BanglaWash
 *
 */
public class Problem_12700 {

	/**
	 * @param args
	 */
	
	not solved
	
	public static Scanner k = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		    int testCase = k.nextInt();
		  
		    
		    
		    for (int i=1; i<=testCase; i++) {
		      
		        int matches = k.nextInt();
		          
		        char str[] = new char [matches];
		        
		            for (int h=0; h<str.length; h++) {
		            	String s  = k.next();
		            	
		            }
		            
		            int A=0,B=0,T=0,W=0;
		            
		            for(int j=0; j<matches; j++){
		                if(str[j]=='A')
		                    A++;
		                else if(str[j]=='B')
		                    B++;
		                else if(str[j]=='T')
		                    T++;
		                else if(str[j]=='W')
		                    W++;
		            }
		            if((B+A==matches)&& B!=0)
		                System.out.printf("Case %d: BANGLAWASH\n",i);
		            else if((W+A==matches) && W!=0)
		                System.out.printf("Case %d: WHITEWASH\n",i);
		            else if(A==matches)
		                System.out.printf("Case %d: ABANDONED\n",i);
		            else if(B>W)
		                System.out.printf("Case %d: BANGLADESH %d - %d\n",i,B,W);
		            else if(B<W)
		                 System.out.printf("Case %d: WWW %d - %d\n",i,W,B);
		            else if(B==W)
		                System.out.printf("Case %d: DRAW %d %d\n",i,B,T);
		            
		    }
		   
		}

	}

