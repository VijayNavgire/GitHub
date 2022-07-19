package PRACTICE;

public class IF_ELSE_BY_MANJUSHA 
{
	public static void main(String[] args)
	{
	
	System.out.println("Pyramid");
		
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
			
			
			
			

	}
}
