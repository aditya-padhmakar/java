
package myprog;

import java.util.*;
//import java.util.Scanner;

public class WithoutBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int n,i;
		
		n=input.nextInt();
		int a[]= new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		
		  Arrays.sort(a); 
		  
		  for(i=0;i<a.length;i++)
		  {
			  System.out.print(a[i]+" ");
		  }
		  
	}

}
