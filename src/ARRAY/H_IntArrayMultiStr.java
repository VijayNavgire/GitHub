package ARRAY;

public class H_IntArrayMultiStr 
{
	public static void main(String[] args) 
	{
		int [][] ar = {{10,30,20},{60,40,50}};
		for(int i=0; i<=1; i++)	//outer for loop
		{
			for(int j=0; j<=2; j++)	//inner for loop
			{
				System.out.println(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("---Practice---");
		int [][] arr = {{10,30,20},{60,40,50}};
		
		for(int i=0; i<=1; i++)	//outer for loop
		{
			for(int j=0; j<=i; j++)	//inner for loop
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
