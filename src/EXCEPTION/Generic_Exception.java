package EXCEPTION;

public class Generic_Exception 
{
	public static void main(String[] args) 
	{
		int [] ar = new int [3];
		System.out.println("Before Exception");
		try
		{
			ar[12] = 20;
			System.out.println(ar);
		}
		catch(Exception ex)
		{
			System.out.println("Generic Exception Handled");
			ex.printStackTrace();
			System.out.println();
		}
		System.out.println("After Exception");
		System.out.println("Hello Sir");
	}

}
