package Codechef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
class Sept04_2017 {
	public static Scanner input = new Scanner(System.in);
 
	public static void main(String[] args) {
 
		double mod=1000000007;
		int t = input.nextInt();
		while (t-- > 0) {
			int n, m;
			n=input.nextInt();
			m=input.nextInt();
			int arr[][] = new int[m][3];
			
			for(int i=0;i<m;i++) 
				for(int j=0;j<3;j++)
					arr[i][j]=input.nextInt();
			
			double f[][] = new double[m][n];
			
			double a[] = new double[n];
			
			for(int i=0;i<m;i++) {
				if(arr[i][0]==1) {
					for(int j=arr[i][1]-1;j<arr[i][2];j++) {
						f[i][j]=1;
					}
				}else {
					for(int k=arr[i][1]-1;k<arr[i][2];k++) {
						for(int j=0;j<n;j++) {
							f[i][j]=f[i][j]+f[k][j];
						}
					}
				}
				
				for(int j=0;j<n;j++)
					a[j]=a[j]+f[i][j];
			}
			/*
			for(int i=0;i<m;i++) {
				if(arr[i][0]==1) {
					for(int j=0;j<n;j++)
						if(i==0&&j>=arr[i][1]-1&&j<arr[i][2])
							result[i][j]=1;
						else if(j>=arr[i][1]-1&&j<arr[i][2])
							result[i][j]=(result[i-1][j]+1)%mod;
						else if(i>0)
							result[i][j]=result[i-1][j];
				}else {
					if(arr[i][1]==1)
					for(int j=0;j<n;j++) 
						result[i][j]=(result[i-1][j]+result[arr[i][2]-1][j])%mod;
					else 
					for(int j=0;j<n;j++)
						result[i][j]=(result[i-1][j]+(result[arr[i][2]-1][j]-result[arr[i][1]-2][j])%mod)%mod;
				}
			}
			*/
			for(int i=0;i<n;i++)
				System.out.print((int)(a[i]%mod)+" ");
			System.out.println();
		}
	}
}