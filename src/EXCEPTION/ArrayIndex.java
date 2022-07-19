package EXCEPTION;

public class ArrayIndex 
{
	public static void main(String[] args) 
	{
		int [] a = new int [4];
		
		System.out.println("Before Exception");
		
		try
		{
			a[12] = 10;
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Array Index Out Of Bounds Exception Handled");
			System.out.println(a);
			a[2] = 20;
			System.out.println(a[2]);
		}
		
		System.out.println("After Eception");
		
	}

}
