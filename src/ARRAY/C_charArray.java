package ARRAY;

import java.util.Arrays;

public class C_charArray 
{
	public static void main(String[] args) 
	{
		char [] chr = new char[5];
		chr[0]= 'V';
		chr[1]= 'I';
		chr[2]= 'J';
		chr[3]= 'A';
		chr[4]= 'Y';
		
		System.out.println("---Print all Data from Character Array---\n");
		System.out.println("Value in Array at 3 is "+chr[3]);
		System.out.println("Array Size "+ chr.length + "\n");
		
		System.out.println("Character Order");
		for(int i = 0; i<=chr.length-1; i++)
		{
			System.out.println(i+" "+ chr[i]);
		}
		System.out.println("------------------");
		System.out.println("Reverse Order Character");
		for(int i=chr.length-1; i>=0; i--)
		{
			System.out.println(i+" "+ chr[i]);
		}
		System.out.println("------------------");
		System.out.println("Ascending Order Character");
		Arrays.sort(chr);
		for(int i=0; i<=chr.length-1; i++)
		{
			System.out.println(i+" "+ chr[i]);
		}
		System.out.println("------------------");
		System.out.println("Descending Order Character");
		for(int i=chr.length-1; i>=0; i--)
		{
			System.out.println(i+" "+ chr[i]);
		}
		
//		System.out.println("Character Order");
//		for(int i = 0; i<=chr.length-1; i++)
//		{
//			System.out.println(i+" "+ chr[i]);
//		}
//		System.out.println("Value in Array at 3 is "+chr[3]);
	}

}
