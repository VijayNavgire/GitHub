package Loops;

public class VarAndAll
{
	int a = 15;
	int j = 30; // global variable
	
	public void m1()
	{
		int a=220;			//local variable
		System.out.println(a);
		int k = this.a;
		System.out.println("Global a Using this keyword =" + k);	// global to local
		System.out.println("Global j = " + j);
	}
	public void m2 ()
	{
		int b = 30;
		int a= 220;
		System.out.println(b);
		System.out.println(a);
		//System.out.println(p);
	}
	public static void main(String[] args) 
	{
		// syntax of object creation 	
		 // className objectName = new className();
		VarAndAll d = new VarAndAll();// access from same class
		d.m1();
		d.m2(); // objectName.methodName
		
		Access_Var z = new Access_Var(); // access from other class
		
		z.m1();
		
		z.m2(15);

		int p = 1;
		System.out.println(p);
		Access_Var.m3("Velocity");
	}

}
