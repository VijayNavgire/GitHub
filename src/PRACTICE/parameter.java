package PRACTICE;

public class parameter 
{
	
	public static void addition()
	{
		System.out.println("Same Class");
		int a = 10, b = 15, sum = a + b;
		System.out.println("Addition of two no. 10 + 15 = "+ sum);
	}
	
	public void subtraction()
	{
		int a = 15, b = 10, sub = a - b;
		System.out.println("Subtraction of two no. 15 - 10 = "+ sub);
	}
	
	public static void multiplication(int a, int b)
	{
		int mul = a * b;
		System.out.println("Multiplication of two no. 10 * 15 = "+ mul);
	}
	
	public void division(int a, int b)
	{
		int div = a / b;
		System.out.println("Division of two no. 45 / 5 = "+ div);
		
	}
	
	
	public static void main(String[] args) 
	{
		addition();
		
		parameter s1 = new parameter();
		s1.subtraction();
		
		multiplication(10, 15);
		
		parameter d1 = new parameter();
		d1.division(45, 5);
		
		parameter_data.addition();
		
		parameter_data s2 = new parameter_data();
		s2.subtraction();
		
		parameter_data.multiplication(8, 10);
		
		parameter_data d2 = new parameter_data();
		d2.division(40, 5);
		
		
	}
	
	

}
