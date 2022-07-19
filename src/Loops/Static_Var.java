package Loops;

public class Static_Var 
{
	static int a= 10; // static global variable
	
	int b = 20; // non-static global variable
	int k = 30;
	
	public static void main(String[] args) {
		System.out.println("Global Variable "+ a);
		
		Static_Var g= new Static_Var();
		System.out.println("Static " +  g.b);
		System.out.println("Static " +  (g.b+g.k));
		
		Non_Static_Var q = new Non_Static_Var();
		System.out.println("Non-Static " + q.d);
		
		System.out.println(Non_Static_Var.c);
		
		Static_Var.m2();
		
		Static_Var r = new Static_Var();
		r.m3();
		
		
	}
	
	public static void m2()
	{
		System.out.println("Static m2 " + a);
		Static_Var g = new Static_Var();
		System.out.println("Static m2 " + g.b);
	}
	public void m3()
	{
		System.out.println("Non Static m3 " +a);
		System.out.println("Non Static m4 "+ b);
	}
	

}
