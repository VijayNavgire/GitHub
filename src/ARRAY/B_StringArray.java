package ARRAY;

import java.util.Arrays;

public class B_StringArray 
{
	public static void main(String[] args) 
	{
		
		String [] ar = new String[5];
		ar[0] = "Manjusha";
		ar[1] = "Mangesh";
		ar[2] = "Omkar";
		ar[3] = "Hrutuja";
		ar[4] = "Vijay";
		
		System.out.println("---Print all Data from String Array---\n");
		System.out.println("Value in Array at 3 is "+ar[3]);
		System.out.println("Array Size "+ ar.length + "\n");
		
		System.out.println("String Order\n");
		for(int i = 0; i<=4; i++)
		{
			System.out.println(i+" "+ar[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Reverse Order String");
		for(int i=ar.length-1; i>= 0; i--)
		{
			System.out.println(i+" "+ ar[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Ascending Order String");
		Arrays.sort(ar);				// Array Sorting
		for(int i = 0; i<=ar.length-1; i++)
		{
			System.out.println(i+" "+ ar[i]);
		}
		
		System.out.println("------------------");
		System.out.println("Descending Order String");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(i+" "+ ar[i]);
		}	
	}

}
