package STAR_PATTERN;

public class Practice_1 
{
	public static void main(String[] args) 
	{
		int star =4;
		for(int i=1; i<=7; i++)		//outer loop
		{
			for(int j=1; j<=7; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<4)
			{
				star --;
			}
			else
			{
				star ++;
			}
		}
		
		
		System.out.println("-----------------------------------------");
		
		int sta=4;
		for(int i=1; i<=7; i++)           //outer for loop --> rows
		{
			for(int j=1; j<=sta; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
									
			if(i<4) 
			{
				sta--;	
			} 
			else
			{
				sta++;	
			}		
		}		

		
	}

}
