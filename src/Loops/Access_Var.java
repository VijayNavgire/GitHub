package Loops;

public class Access_Var 
{
	int a = 100;
	int g = 200;
	int x = 25;
	
	public void m1() // without parameter
	{
		int z = this.x;
		int b = 20;
		int a = 50;
		System.out.println(a);
		System.out.println(b);
		System.out.println(z);
	}
	
	public void m2(int c) // with parameter
	{
		System.out.println(" From Non Static " + c);
	}
	
	 public static void m3(String d)
	 {
		 System.out.println("Static "+ d);
	 }
	 
	 int p = 5;

}
