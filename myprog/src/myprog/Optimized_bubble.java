package myprog;

import java.util.Scanner;

public class Optimized_bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n,i,j;
		int a[]=new int[100];
		
		n=input.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		
		String s="false";
		//input.close();
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j+1];
					a[j+1]=a[j];
					a[j]=t;
					s="true";
				}
			}
			if(s=="false")
				break;
		}
		
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
