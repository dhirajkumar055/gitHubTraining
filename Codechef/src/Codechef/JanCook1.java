package Codechef;

import java.util.Scanner;

public class JanCook1 {
	
	public static Scanner input = new Scanner(System.in);
	public static void main(String args[]) {
		
		int t = input.nextInt();
		
		while(t>0) {
			t--;
			int f=1;
			try {
			int n=input.nextInt(),k=input.nextInt(),s=input.nextInt();
			if(n<k)
				f=0;
			
			if(n==k&&k>=7)
				f=0;
			
			if(6*n<k*7)
				f=0;
			
			if(f==1)
				System.out.println((int)Math.ceil((double)k*(double)s/(double)n));
			else
				System.out.println("-1");
			}
			catch(Exception e) {
				System.out.println("My error");
				return ;
			}
		}
	}
}
