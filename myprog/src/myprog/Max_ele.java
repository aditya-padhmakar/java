package myprog;

import java.util.Scanner;

public class Max_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		int a[]= new int[n];
		int s=0;
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
			s=s+a[i];
		}
		System.out.print("sum of the array is "+ s);
		input.close();
	}

}
