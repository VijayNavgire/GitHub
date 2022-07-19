package SELF;

public class Constructor_Practice 
{
	int num1, num2;
	
	public void add()
	{
		System.out.println("Hello");
	}
	
	
	Constructor_Practice(int a, int b)
	{
		num1 = a;
		num2 = b;
		
	}
	
	public void sub()
	{
		
		System.out.println("Subtraction "+ (num1 - num2));
	}
	
	public void div()
	{
		System.out.println("Division "+ (num1 / num2));
	}
	
	
	public static void main(String[] args) {
		
		Constructor_Practice c1 = new Constructor_Practice(10 , 5);
		c1.sub();
		c1.add();
		c1.div();
	}

}
