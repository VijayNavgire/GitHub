package PRACTICE;

public class For_Loop {
	public static void main(String[] args) 
	{
		System.out.println("Increase Number ");
		

		for(int i = 1; i<=5; i++)
		{
			System.out.println(" "+i);
		}
		System.out.println("-------------------------");
		
		
		System.out.println("Reverse Number ");
		
		for(int i = 5; i>=1; i--)
		{
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		System.out.println("Increase Number from Print ");
		
		for(int i = 1; i<=5;)
		{
			System.out.println(i++);
		}
		
		
		
		System.out.println("--------------------------");
		
		System.out.println("Reverse Number From Print ");
		
		for(int i = 5; i>=1;)
		{
			System.out.println(i--);
		}
		
		System.out.println("---------------------------");
		
		System.out.println("Increase Number by 2");
		
		for(int i = 2; i<=10; i=i+2)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		
		System.out.println("Reverse Number by 2");
		
		for(int i = 10; i>=1; i=i-2)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		System.out.println("Square Number ");
		for(int i = 1; i<=5; i++)
		{
			System.out.println("Square of "+i+" is "+i*i);
		}
		System.out.println("--------------------------");
		System.out.println("Square Number from PRINT");
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Square of "+i+" is "+i*i);
		}
		
		System.out.println("--------------------------");
		System.out.println("Cube Number ");
		for(int i = 1; i<=5; i++)
		{
			System.out.println("Cube of "+i+" is "+ i*i*i);
		}
		System.out.println("--------------------------");
		System.out.println("Message Printing ");
		for(int i = 1; i<=5; i++)
		{
			System.out.println("I Am VIJAY the Great");
		}
		
		System.out.println("--------------------------");
		System.out.println("Alphabate = ");
		
		
		//for(char i = 'A'; i <='Z'; i++)
		////
		//{
//			System.out.print(i +" ");
		//	
//			for(char j = 'a'; i<='z'; j++)
//			{
//			System.out.print(j);
//			}
//			System.out.println();
		//
		//}

		
		
		
		System.out.println("----------------------------------");
		System.out.println("Changes");
		
		for(int i = 1; i<=5; i= ++i)
		{
			//System.out.println(i);
			for(int j=10; j <= 15;j++)
			{
				System.out.println("i "+i);
				System.out.println("J "+j);
			}
			for(int k = 25; k <= 30; k++)
			{
				System.out.println("K "+ k);
			}
		}

	}

}






