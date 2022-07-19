package ARRAY;

public class Array_Odd_Even 
{
	public static void main(String[] args) 
	{
		int ar[] = {1,2,3,4,5,6,7,8};
		System.out.println("EVEN Number");
		
		for(int i=0;i<ar.length;i++)
		{  
			if(ar[i]%2==0)
			{  
				System.out.println(ar[i]);  
			}  
		}  
		System.out.println("------------");
		System.out.println("Odd Number");
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]%2!=0)
			{
				System.out.println(ar[i]);
			}
		}
		
		
		
		
		
	}

}
