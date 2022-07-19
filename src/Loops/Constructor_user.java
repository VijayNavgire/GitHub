package Loops;

public class Constructor_user 
{
	int num1,num2,num3,num4,num5;
	String num6, num9;
	float num7;
	char num8;
	
	Constructor_user()
	{
		num1 = 100;
		num2 = 20;
	}
	
	Constructor_user(int a, int b)
	{
		num3 = a;
		num4 = b;
	}
	Constructor_user(int a, String b, float c)
	{
		num5 = a;
		num6 = b;
		num7 = c;
	}
	Constructor_user(char c)
	{
		num8 = c;
	}
	Constructor_user(String d)
	{
		num9 = d;
	}
	
	
	public void add()
	{
		System.out.println("Addition of two no. is Local Var "+ (num1 + num2));
		
	}
	public void add_para()
	{
		System.out.println("Addition of two no. is Parameter "+ (num3 + num4));
	}
	public void info()
	{
		System.out.println("Sr.No = " + num5 + "\nName = "+num6+ "\rPer = "+num7);
	}
	public void grade()
	{
		System.out.println("Grade = "+ num8);
	}
	
	
	public void mul()
	{
		System.out.println("Multiplication of two no. is "+ (num1 * num2));
	}
	
	public static void div()
	{
		Constructor_user d = new Constructor_user();
		System.out.println("Division of Two No. is "+ (d.num1/d.num2));
	}
	
	public static void aim()
	{
		Constructor_user e = new Constructor_user("I want to be a Software Tester.");
		System.out.println("My AIM = "+ e.num9);
	}
	
	public static void main(String[] args) {
		
		Constructor_user s = new Constructor_user();
		s.add();
		
		Constructor_user s2 = new Constructor_user(25,10);
		s2.add_para();
		
		Constructor_user s3 = new Constructor_user(24, "Vijay", 74.6f);
		s3.info();
		
		Constructor_user s4 = new Constructor_user('A');
		s4.grade();
		
		s.mul();
		  
		aim();
		div();
	}
	

}
