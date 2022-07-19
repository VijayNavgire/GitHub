package EXCEPTION;

public class Mul_Catch_Gen 
{
	public static void main(String[] args) 
	{
		int [] ar = new int [3];
		System.out.println("Before Exception Handling");
		
		try
		{
			ar[12] = 20;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception");
			System.out.println(ar);
		}
		catch(NullPointerException npe)
		{
			System.out.println("Null pointer Exception Handled");
		}
	/*	catch(ArrayIndexOutOfBoundsException aib)
		{
			System.out.println("Array Index Out Of Bounds Exception");
		}*/
		catch(Exception e)
		{
			System.out.println("Generic Exception ");
			e.printStackTrace();
		}
		System.out.println("After Exception Handled");
		System.out.println("Hello");
		
	}

}
