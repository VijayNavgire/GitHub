package ARRAY;

import java.util.Arrays;

public class A_intArray 
{
	public static void main(String[] args) 
	{
		int [] ar = new int [5];	// array declaration
		
		// array initialization
		ar[0]= 40;
		ar[1]= 50;
		ar[2]= 10;
		ar[3]= 30;
		ar[4]= 20;
		
		int [] in = new int[5];
		in[0]= 45;
		in[1]= 17;
		in[2]= 35;
		in[3]= 25;
		in[4]= 5;
		
		// Array usage
		System.out.println(ar[4]);
		System.out.println(ar.length);
		
		System.out.println("------Print all info in array------");
		
		for(int i = 0; i<= 4; i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("---------------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(i+" "+ar[i]);
		}
		
System.out.println("\n---Print all Data from Number Array---\n");
		
		System.out.println("Values in Array at 2 is "+ in[2]);
		System.out.println("Array Size "+ in.length + "\n");
		
		System.out.println("Number Order");
		for(int i = 0; i<=4; i++)
		{
			System.out.println(i+" "+ in[i]);
		}
		System.out.println("------------------");
		System.out.println("Reverse Order Number");
		
		for(int i=in.length-1; i>=0; i--)
		{
			System.out.println(i+" "+ in[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Ascending Order Number");
		Arrays.sort(in);
		for(int i = 0; i<=in.length-1; i++)
		{
			System.out.println(i+" "+ in[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Descending Order Number");
		for(int i=in.length-1; i>=0; i--)
		{
			System.out.println(i+" "+ in[i]);
	}
	}
}
