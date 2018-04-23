/**
 * 
 */
package volume_100_Problem_10000_to_10099;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 *
 *WERTYU
 */
public class Problem_10082 {
	
	 public static void main (String chayapoth[]) {
	        Scanner k = new Scanner(System.in);
	        int c ;
	        String s;
	        while(k.hasNext()){
	            s = k.nextLine();
	            char [] ab = new char [s.length()] ;
	            s.getChars (0, s.length(), ab, 0) ;
	 
	            c = 0;
	            while(c < ab.length) {
	                if( ab [c]=='A')
	                    ab [c]='A';
	                else if(ab [c]=='B')
	                    ab [c]='V';
	                else if(ab [c]=='C')
	                    ab [c]='X';
	                else if(ab [c]=='D')
	                    ab [c]='S';
	                else if(ab [c]=='E')
	                    ab [c]='W';
	                else if(ab [c]=='F')
	                    ab [c]='D';
	                else if(ab [c]=='G')
	                    ab [c]='F';
	                else if(ab [c]=='H')
	                    ab [c]='G';
	                else if(ab [c]=='I')
	                    ab [c]='U';
	                else if(ab [c]=='J')
	                    ab [c]='H';
	                else if(ab [c]=='K')
	                    ab [c]='J';
	                else if(ab [c]=='L')
	                    ab [c]='K';
	                else if(ab [c]=='M')
	                    ab [c]='N';
	                else if(ab [c]=='N')
	                    ab [c]='B';
	                else if(ab [c]=='O')
	                    ab [c]='I';
	                else if(ab [c]=='P')
	                    ab [c]='O';
	                else if(ab [c]=='Q')
	                    ab [c]='Q';
	                else if(ab [c]=='R')
	                    ab [c]='E';
	                else if(ab [c]=='S')
	                    ab [c]='A';
	                else if(ab [c]=='T')
	                    ab [c]='R';
	                else if(ab [c]=='U')
	                    ab [c]='Y';
	                else if(ab [c]=='V')
	                    ab [c]='C';
	                else if(ab [c]=='W')
	                    ab [c]='Q';
	                else if(ab [c]=='X')
	                    ab [c]='Z';
	                else if(ab [c]=='Y')
	                    ab [c]='T';
	                else if(ab [c]=='Z')
	                    ab [c]='Z';
	                else if(ab [c]=='[')
	                    ab [c]='P';
	                else if(ab [c]==']')
	                    ab [c]='[';
	                else if(ab [c]=='\\')
	                    ab [c]=']';
	                else if(ab [c]==';')
	                    ab [c]='L';
	                else if(ab [c]=='\'')
	                    ab [c]=';';
	                else if(ab [c]=='/')
	                    ab [c]='.';
	                else if(ab [c]=='.')
	                    ab [c]=',';
	                else if(ab [c]==',')
	                    ab [c]='M';
	                else if(ab [c]=='1')
	                    ab [c]='`';
	                else if(ab [c]=='2')
	                    ab [c]='1';
	                else if(ab [c]=='3')
	                    ab [c]='2';
	                else if(ab [c]=='4')
	                    ab [c]='3';
	                else if(ab [c]=='5')
	                    ab [c]='4';
	                else if(ab [c]=='6')
	                    ab [c]='5';
	                else if(ab [c]=='7')
	                    ab [c]='6';
	                else if(ab [c]=='8')
	                    ab [c]='7';
	                else if(ab [c]=='9')
	                    ab [c]='8';
	                else if(ab [c]=='0')
	                    ab [c]='9';
	                else if(ab [c]=='-')
	                    ab [c]='0';
	                else if(ab [c]=='=')
	                    ab [c]='-';
	                c++;
	            }
	 
	            c=0;
	 
	            while(c < ab.length) {
	                System.out.print(ab [c]);
	                c++;
	            }
	            System.out.println("");
	        }
	    }

}
