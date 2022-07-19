package ARRAY;

import java.util.Arrays;

public class D_StringArraySingle 
{
	public static void main(String[] args) 
	{
		String [] str = {"Mangesh","Hrutuja","Manjusha","Omkar","Vijay"};
		
		System.out.println("---Print all Data from String Single Array---\n");
		System.out.println("Value in Array at 3 is "+ str[3]);
		System.out.println("Array Size "+ str.length);
		
		System.out.println("String Order\n");
		for(int i = 0; i<=4; i++)
		{
			System.out.println(i+" "+str[i]);
		}
		System.out.println("------------------");
		System.out.println("Reverse Order String Single");
		for(int i=str.length-1; i>= 0; i--)
		{
			System.out.println(i+" "+ str[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Ascending Order String Single");
		Arrays.sort(str);				// Array Sorting
		for(int i = 0; i<=str.length-1; i++)
		{
			System.out.println(i+" "+ str[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Descending Order String Single");
		for(int i=str.length-1; i>=0; i--)
		{
			System.out.println(i+" "+ str[i]);
		}	
	}

}
