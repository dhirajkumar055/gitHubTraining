package DataStructure;
//First : 27 September 2017
import java.util.Scanner;

public class QuickSort {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String args[]) {
		int n;
		n = input.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) 
			arr[i] = input.nextInt();
		
		sort(arr,0,n-1);
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

	private static void sort(int[] arr,int l, int r) {
		//l for left index
		//r for right index
		if(l<r) {
			int p=partition(arr,l,r);
			sort(arr,l,p-1);
			sort(arr,p+1,r);
		}
	}

	private static int partition(int[] arr, int l, int r) {
		
		int pivot=arr[r];	//rightmost element is choosen as pivot
		int i=l;
		for(int j=l;j<r;j++) {
			if(arr[j]<=pivot) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
		}
		//Note above swap arr[i],arr[j]
		//and below swap arr[i], arr[r]
		int temp=arr[i];
		arr[i]=arr[r];
		arr[r]=temp;
		return i;
	}
	
}
