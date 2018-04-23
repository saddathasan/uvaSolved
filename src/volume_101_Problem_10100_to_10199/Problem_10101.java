/**
 * 
 */
package volume_101_Problem_10100_to_10199;

import java.util.Scanner;

/**
 * @author Saddat Hasan
 *
 *
 *
 *Bangla Numbers 
 */
public class Problem_10101 {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);


		int cases=1;

		while (true) {

			long number=0;

			try {
				number=k.nextLong();
			} 
			catch (Exception e) {
				break;
			}

			String temp=cases+"";
			int num=temp.length();
			for(int i=0;i<4-num;i++) {
				temp=" "+temp;
			}

			System.out.print(temp+". ");
			call(number);
			System.out.println();
			cases++;
		}
	}

	public static void call(long number) {
		if (number==0) {
			System.out.print("0");
			return;
		} 

		long number_2=number;
		long temp=0;
		boolean first=true;
		temp=number_2/10000000;

		if(temp>0 && temp<100) {
			System.out.print(temp+" kuti");
			first=false;
		}
		if(temp>99) {
			call(temp);
			System.out.print(" kuti");
			first=false;
		}
		number_2=number%10000000;
		temp=number_2/100000;
		if(temp>0 && temp<100) {
			if(!first)
				System.out.print(" ");
			System.out.print(temp+" lakh");
			first=false;
		}
		if(temp>99) {
			call(temp);
			System.out.print(" lakh");
			first=false;
		}

		number_2=number%100000;
		temp=number_2/1000;
		if(temp>0){
			if(!first)
				System.out.print(" ");
			System.out.print(temp+" hajar");
			first=false;
		}

		number_2=number%1000;
		temp=number_2/100;
		if(temp>0){
			if(!first)
				System.out.print(" ");
			System.out.print(temp+" shata");
			first=false;
		}

		number_2=number%100;
		temp=number_2;
		if(temp>0){
			if(!first)
				System.out.print(" ");
			System.out.print(temp);
			first=false;
		}

	}

}
