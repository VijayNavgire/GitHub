package EXCEPTION;

public class Arithmetic_E 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 0, c = 0;
		System.out.println("Before Exception");
		try
		{
			c= a/b;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmatic Exception Handled");
			c= a/1;
		}
		System.out.println(c);
		System.out.println("After Exception");
		
	}

}
