package EXCEPTION;

public class Mul_Catch 
{
	public static void main(String[] args) 
	{
		int [] ar = new int [3];
		System.out.println("Before Exception");
		
		try
		{
			ar [7] = 10;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception Handled");
		}
		catch(NullPointerException npe)
		{
			System.out.println("Null Pointer Exception Handling");
		}
		catch(ArrayIndexOutOfBoundsException aib)
		{
			System.out.println("Array Index Out of Bounds Exception Handled");
		}
		System.out.println("After Exception Handled");
		System.out.println("Hello there");
		
	}

}
