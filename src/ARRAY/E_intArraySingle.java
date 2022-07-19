package ARRAY;

import java.util.Arrays;

public class E_intArraySingle 
{
	public static void main(String[] args) 
	{
		int [] num = {2,4,1,0,9,3};
		
		System.out.println("---Print all Data from Integer Single Array---\n");
		System.out.println("Value in Array at 4 is "+ num[4]);
		System.out.println("Array Size "+ num.length);
		
		System.out.println("\nInteger Order\n");
		for(int i = 0; i<=5; i++)
		{
			System.out.println(i+" "+num[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Reverse Order Integer Single");
		for(int i=num.length-1; i>= 0; i--)
		{
			System.out.println(i+" "+ num[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Ascending Order Integer Single");
		Arrays.sort(num);				// Array Sorting
		for(int i = 0; i<=num.length-1; i++)
		{
			System.out.println(i+" "+ num[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Descending Order Integer Single");
		for(int i=num.length-1; i>=0; i--)
		{
			System.out.println(i+" "+ num[i]);
		}	
	}

}
