package myprog;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n,e;
		System.out.println("enter size");
		n=input.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		
		System.out.println("enter ele to search");
		e=input.nextInt();
		
		int f=0;
		int l=n-1;
		for(int i=0;i<n;i++)
		{
			int mid=(f+l)/2;
			if(a[mid]==e)
				{
				System.out.println("ele found at "+(mid+1)+" position");
				break;
				}
			else if(a[mid]<e)
				f=mid+1;
			else
				l=mid-1;
		}
	}

}
