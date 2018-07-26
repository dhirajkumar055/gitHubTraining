package DataStructure;
//First : 27 September 2017

import java.util.Scanner;

public class HeapSort {
	
	//n length of array, c index of current/root node
	public static void heapify(int arr[],int n,int c) {
		int m=c;			//m for max element index
		int l=c*2+1;		//l for left index
		int r=c*2+2;		//r for right index
		
		if(l<n&&arr[l]>arr[c]) 	
			m=l;
		
		if(r<n&&arr[r]>arr[c])
			m=r;
		
		if(m!=c) {
			int x = arr[m];
			arr[m]=arr[c];
			arr[c]=x;	
			heapify(arr,n,m);
		}
	}

	public static void sort(int arr[]) {
		
		int n = arr.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--) {
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			heapify(arr,i,0);
		}
		
	}
	public static Scanner input = new Scanner(System.in);
	public static void main(String args[]) {
		int n = input.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) 
			arr[i] = input.nextInt();
		
		sort(arr);
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
	}
}
