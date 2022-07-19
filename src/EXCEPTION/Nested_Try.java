package EXCEPTION;

public class Nested_Try 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 0, c = 0;
		int [] ar = new int [3];
		
		System.out.println("Before Exception");
		
		try
		{
			
			try
			
			{
				ar[12] = 10;
			}
			catch(ArrayIndexOutOfBoundsException aib)
			{
				System.out.println("Array Index Out Of Bounds Exception Handled");
				ar[2] = 10;
				System.out.println(ar);
			}
			c = a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmatic Exception Handled");
			c = a/2;
			System.out.println(c);
		}
		System.out.println("After Exception");
	//	System.out.println(a/b);
		
		System.out.println("Hello ");
	}

}
