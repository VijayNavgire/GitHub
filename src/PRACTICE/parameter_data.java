package PRACTICE;

public class parameter_data 
{
	public static void addition()
	{
		System.out.println("Different Class");
		int a = 15, b = 15, sum = a + b;
		System.out.println("Addition of two no. 15 + 15 = "+ sum);
	}
	
	public void subtraction()
	{
		int a = 25, b = 5, sub = a - b;
		System.out.println("Subtraction of two no. 25 - 5 = "+ sub);
	}
	
	public static void multiplication(int a, int b)
	{
		int mul = a * b;
		System.out.println("Multiplication of two no. 8 * 10 = "+ mul);
	}
	
	public void division(int a, int b)
	{
		int div = a / b;
		System.out.println("Division of two no. 40 / 5 = "+ div);
	}

}
