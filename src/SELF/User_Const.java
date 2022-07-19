package SELF;

public class User_Const 
{
	int num1 = 10;
	int num2 = 20;
	
	public void addition(int a , int b)
	{
		int c =a+b;
		System.out.println(c);
		System.out.println("Addition = " + (num1 + num2) );
		System.out.println("Addition of C = "+ c);
	}
	
	public void multiplication()
	{
		System.out.println("Multiplication =" + (num1*num2) );
	}
	
//	public static void sub()
//	{
//		System.out.println(num2-num1);
//	}
	
	public static void main(String[] args) {
		
		System.out.println("---------------------");
		
		System.out.println("User Define Constructor");
		
		User_Const  s3 = new User_Const();
		
		s3.addition(1,2);
		s3.multiplication();
	}
	

}
