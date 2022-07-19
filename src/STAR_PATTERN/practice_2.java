package STAR_PATTERN;

public class practice_2 
{
	public static void main(String[] args) 
	{
		int star = 4;
		int space = 0;
		
		for(int i=1; i<=7; i++)
		{
			for(int j = 1; i<=space; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j<=star; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			
			if(i<4)
			{
				star--;
				space++;
			}	
			else
			{
				star++;
				space--;
			}
		}
		
		System.out.println("------------------------------------");
		
		int str = 1;
		int spac = 4;
		
		for(int i=1; i<=9; i++)
		{
			for(int j = 1; j<=spac; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j<=str; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
			
			if(i<5)
			{
				spac--;
				str++;				
			}	
			else
			{
				spac++;
				str--;
			}
		}
		
		
	}

}
