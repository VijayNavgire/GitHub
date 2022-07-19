package EXCEPTION;

public class Mul_Try_Catch 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 0, c = 0;
		int [] ar  = new int [3];
		
		System.out.println("Before Exception");
		
		try
		{
			c = a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception Handled");
			c=a/1;
			System.out.println(c);
		}
		
		try
		{
			ar[5] = 10;
		}
		catch(ArrayIndexOutOfBoundsException aib)
		{
			System.out.println("Array Index Out Of Bounds Exception Handled");
			ar[2]=25;
			System.out.println(ar);
		}
		
		
	}

}
