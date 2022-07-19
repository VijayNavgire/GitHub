package Loops;

public class For_Loop 
{
	public static void main(String[] args)
	{

		System.out.println("1st Program :- ");
		for(int i=1; i<=5; i++)
		{
			for(int j= 1; j<=5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}	
		System.out.println("------------------------------");
		
		System.out.println("2nd Program :- ");
		for(int i=1; i<=5; i++)
		{				// 3 <= 2
			for(int j=1; j<=i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		System.out.println("3rd Program :- ");
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("-------------------------------");
		System.out.println("4th Program :- ");
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------------");
		System.out.println("5th Program :- ");
		//int n=5;
		for(int i=1; i<=5; i++)
		{
			/*
			 * for(int j=1; j<=5; j++) { System.out.print(" "); }
			 */
			for(int j=1; j<=i; j++)
			//for(int k=6; k<=i; k++)
			{
				System.out.print("* ");
			//	System.out.print(k+"&");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		System.out.println("6th Program :- \n");
		
		int n = 5;
		
		for(int i = 0; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(" ");
			}

			for(int j=0; j<= i; j++)
			{
				System.out.print("*");
			}
			for(int j = 0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for( int i = 0; i<=n; i++)
			{
				for(int j=0; j<=i; j++)
				{
					System.out.print(" ");
				}
				for(int j=i; j<=n; j++)
				{
					System.out.print("*");
				}
				for(int j = i; j<=n; j++)
				{
					System.out.print("*");
				}

				System.out.println();
			}
	
	
			int l=6;
			
			for (int i=1; i<=l; i++)
		    {
		   	 for(int j=i; j<=l; j++)
		   	 {
		   		 System.out.print(" ");
		   	 }
		   	 for(int j=1; j<=i; j++)
		   	 {
		   	     System.out.print("*");
		   	 }
		   	 for(int j=1; j<=i; j++)
		   	 {
		   		 System.out.print("*");
		        }
		   	 System.out.println();
		   }
			for (int i=1; i<=l; i++)
		    {
		   	 for(int j=1; j<=i; j++)
		   	 {
		   		 System.out.print(" ");
		   	 }
		   	 for(int j=i; j<=l; j++)
		   	 {
		   	     System.out.print("*");
		   	 }
		   	 for(int j=i; j<=l; j++)
		   	 {
		   		 System.out.print("*");
		        }
		   	 System.out.println();
		   }
			System.out.println("----------------------------");
			System.out.println("7th Program :- ");
	
	}
}
