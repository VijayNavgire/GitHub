package ARRAY;

import java.util.Arrays;

public class F_CharArraySingle 
{
	public static void main(String[] args) 
	{
		char [] chr = {'V','I','J','A','Y'};
		
		System.out.println("---Print all Data from Character Single Array---\n");
		System.out.println("Value in Array at 3 is "+ chr[3]);
		System.out.println("Array Size "+ chr.length);
		
		System.out.println("\nCharacter Order\n");
		for(int i = 0; i<=4; i++)
		{
			System.out.println(i+" "+chr[i]);
		}
		System.out.println("------------------");
		System.out.println("Reverse Order Character Single");
		for(int i=chr.length-1; i>= 0; i--)
		{
			System.out.println(i+" "+ chr[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Ascending Order Character Single");
		Arrays.sort(chr);				// Array Sorting
		for(int i = 0; i<=chr.length-1; i++)
		{
			System.out.println(i+" "+ chr[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Descending Order Character Single");
		for(int i=chr.length-1; i>=0; i--)
		{
			System.out.println(i+" "+ chr[i]);
		}	
	}

}
